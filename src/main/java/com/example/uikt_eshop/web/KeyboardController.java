package com.example.uikt_eshop.web;

import com.example.uikt_eshop.models.products.Keyboard;
import com.example.uikt_eshop.service.KeyboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/keyboards")
public class KeyboardController {

    private final KeyboardService keyboardService;

    public KeyboardController(KeyboardService keyboardService) {
        this.keyboardService = keyboardService;
    }

    @GetMapping
    List<Keyboard> getKeyboards() {
        return keyboardService.getKeyboards();
    }

    @GetMapping(value = "{id}")
    Keyboard getKeyboardById(@PathVariable Long id) {
        return keyboardService.getKeyboardById(id);
    }

    @PostMapping
    Keyboard createKeyboard(@RequestBody Keyboard keyboard) {
        return keyboardService.createKeyboard(keyboard);
    }

    @PutMapping(value = "{id}")
    Keyboard updateKeyboard(@PathVariable Long id, @RequestBody Keyboard keyboard) {
        return keyboardService.updateKeyboard(id, keyboard);
    }

    @DeleteMapping(value = "{id}")
    void deleteKeyboard(@PathVariable Long id) {
        keyboardService.deleteKeyboard(id);
    }
}
