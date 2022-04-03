package com.example.uikt_eshop.service;

import com.example.uikt_eshop.models.products.Monitor;

import java.util.List;

public interface MonitorService {

    List<Monitor> getMonitors();

    Monitor getMonitorById(Long id);

    Monitor createMonitor(Monitor monitor);

    Monitor updateMonitor(Long id, Monitor monitor);

    void deleteMonitor(Long id);
}
