package com.example.uikt_eshop.service.implementation;

import com.example.uikt_eshop.models.Product;
import com.example.uikt_eshop.models.dto.ProductDto;
import com.example.uikt_eshop.repository.ProductRepository;
import com.example.uikt_eshop.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAllProducts();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Optional<Product> findByName(String name) {
        return this.productRepository.findByName(name);
    }

    @Override
    public Optional<Product> save(ProductDto productDto) {
        //TODO Implement save when frontend decides the productDTO for saving.
        return Optional.empty();
    }

    @Override
    public Optional<Product> edit(Long id, ProductDto productDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.productRepository.deleteById(id);
    }

}
