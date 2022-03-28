package com.example.uikt_eshop.repository;

import com.example.uikt_eshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select p.id, p.name, p.price, p.category_id from Product as p", nativeQuery = true)
    List<Product> findAllProducts();

    Optional<Product> findByName(String name);
}