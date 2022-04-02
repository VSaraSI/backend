package com.example.uikt_eshop.service.impl;

import com.example.uikt_eshop.exception.EntityNotFoundException;
import com.example.uikt_eshop.models.products.Keyboard;
import com.example.uikt_eshop.repository.KeyboardRepository;
import com.example.uikt_eshop.service.KeyboardService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardServiceImpl implements KeyboardService {

    private final KeyboardRepository keyboardRepository;

    public KeyboardServiceImpl(KeyboardRepository keyboardRepository) {
        this.keyboardRepository = keyboardRepository;
    }

    @Override
    public List<Keyboard> getKeyboards() {
        return keyboardRepository.findAll();
    }

    @Override
    public Keyboard getKeyboardById(Long id) {
        return keyboardRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Keyboard not found"));
    }

    @Override
    public Keyboard createKeyboard(Keyboard keyboard) {
        return keyboardRepository.save(keyboard);
    }

    @Override
    public Keyboard updateKeyboard(Long id, Keyboard keyboard) {
        Keyboard existingKeyboard = getKeyboardById(id);
        BeanUtils.copyProperties(existingKeyboard, keyboard);
        return keyboardRepository.save(existingKeyboard);
    }

    @Override
    public void deleteKeyboard(Long id) {
        keyboardRepository.deleteById(id);
    }
}
