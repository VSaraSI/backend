package com.example.uikt_eshop.service;

import com.example.uikt_eshop.models.products.Keyboard;
import com.example.uikt_eshop.models.products.Mouse;

import java.util.List;

public interface MouseService {
    List<Mouse> getMouses();

    Mouse getMouseById(Long id);

    Mouse createMouse(Mouse mouse);

    Mouse updateMouse(Long id, Mouse mouse);

    void deleteMouse(Long id);
}
