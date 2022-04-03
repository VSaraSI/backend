package com.example.uikt_eshop.service;

import com.example.uikt_eshop.models.products.Keyboard;

import java.util.List;

public interface KeyboardService {

    List<Keyboard> getKeyboards();

    Keyboard getKeyboardById(Long id);

    Keyboard createKeyboard(Keyboard keyboard);

    Keyboard updateKeyboard(Long id, Keyboard keyboard);

    void deleteKeyboard(Long id);
}
