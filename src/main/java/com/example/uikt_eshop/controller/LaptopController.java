package com.example.uikt_eshop.controller;

import com.example.uikt_eshop.models.products.Laptop;
import com.example.uikt_eshop.service.LaptopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "laptops")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping
    List<Laptop> getLaptops() {
        return laptopService.getLaptops();
    }

    @GetMapping(value = "{id}")
    Laptop getLaptopById(@PathVariable Long id) {
        return laptopService.getLaptopById(id);
    }

    @PostMapping
    Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @PutMapping(value = "{id}")
    Laptop updateLaptop(@PathVariable Long id, @RequestBody Laptop laptop) {
        return laptopService.updateLaptop(id, laptop);
    }

    @DeleteMapping(value = "{id}")
    void deleteLaptop(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
    }
}
