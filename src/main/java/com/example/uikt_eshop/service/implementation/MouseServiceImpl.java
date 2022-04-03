package com.example.uikt_eshop.service.implementation;

import com.example.uikt_eshop.models.products.Mouse;
import com.example.uikt_eshop.repository.MouseRepository;
import com.example.uikt_eshop.service.MouseService;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MouseServiceImpl implements MouseService {

    private final MouseRepository mouseRepository;

    public MouseServiceImpl(MouseRepository mouseRepository) {
        this.mouseRepository = mouseRepository;
    }

    @Override
    public List<Mouse> getMouses() {
        return mouseRepository.findAll();
    }

    @Override
    public Mouse getMouseById(Long id) {
        return mouseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Mouse not found"));
    }

    @Override
    public Mouse createMouse(Mouse mouse) {
        return mouseRepository.save(mouse);
    }

    @Override
    public Mouse updateMouse(Long id, Mouse mouse) {
        Mouse exitingMouse = getMouseById(id);
        BeanUtils.copyProperties(exitingMouse, mouse);
        return mouseRepository.save(exitingMouse);
    }

    @Override
    public void deleteMouse(Long id) {
        mouseRepository.deleteById(id);
    }
}
