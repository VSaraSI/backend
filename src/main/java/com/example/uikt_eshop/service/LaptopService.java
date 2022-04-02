package com.example.uikt_eshop.service;

import com.example.uikt_eshop.models.products.Laptop;

import java.util.List;

public interface LaptopService {

    List<Laptop> getLaptops();

    Laptop getLaptopById(Long id);

    Laptop createLaptop(Laptop laptop);

    Laptop updateLaptop(Long id, Laptop laptop);

    void deleteLaptop(Long id);
}
