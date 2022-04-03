package com.example.uikt_eshop.service.impl;

import com.example.uikt_eshop.exception.EntityNotFoundException;
import com.example.uikt_eshop.models.products.Monitor;
import com.example.uikt_eshop.repository.MonitorRepository;
import com.example.uikt_eshop.service.MonitorService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {

    private final MonitorRepository monitorRepository;

    public MonitorServiceImpl(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    @Override
    public List<Monitor> getMonitors() {
        return monitorRepository.findAll();
    }

    @Override
    public Monitor getMonitorById(Long id) {
        return monitorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Monitor not found"));
    }

    @Override
    public Monitor createMonitor(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    @Override
    public Monitor updateMonitor(Long id, Monitor monitor) {
        Monitor existingMonitor = getMonitorById(id);
        BeanUtils.copyProperties(existingMonitor, monitor);
        return monitorRepository.save(existingMonitor);
    }

    @Override
    public void deleteMonitor(Long id) {
        monitorRepository.deleteById(id);
    }
}
