package com.example.uikt_eshop.web;

import com.example.uikt_eshop.models.products.Mouse;
import com.example.uikt_eshop.service.MouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mice")
public class MouseController {
    private final MouseService mouseService;

    public MouseController(MouseService mouseService) {
        this.mouseService = mouseService;
    }

    @GetMapping
    public List<Mouse> getMouses(){
        return mouseService.getMouses();
    }

    @GetMapping("/{id}")
    public Mouse getMouseById(@PathVariable Long id){
        return mouseService.getMouseById(id);
    }

    @PostMapping
    public Mouse createMouse(@RequestBody Mouse mouse){
        return mouseService.createMouse(mouse);
    }

    @PutMapping("/{id}")
    public Mouse updateMouse(@PathVariable Long id, @RequestBody Mouse mouse){
        return mouseService.updateMouse(id, mouse);
    }

    @DeleteMapping("/{id}")
    public void deleteMouse(@PathVariable Long id){
        mouseService.deleteMouse(id);
    }
}
