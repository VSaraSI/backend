package com.example.uikt_eshop.service.impl;

import com.example.uikt_eshop.exception.EntityNotFoundException;
import com.example.uikt_eshop.models.products.Laptop;
import com.example.uikt_eshop.repository.LaptopRepository;
import com.example.uikt_eshop.service.LaptopService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public List<Laptop> getLaptops() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop getLaptopById(Long id) {
        return laptopRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Laptop not found"));
    }

    @Override
    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public Laptop updateLaptop(Long id, Laptop laptop) {
        Laptop existingLaptop = getLaptopById(id);
        BeanUtils.copyProperties(existingLaptop, laptop);
        return laptopRepository.save(existingLaptop);
    }

    @Override
    public void deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
    }
}
