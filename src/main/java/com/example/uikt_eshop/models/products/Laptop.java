package com.example.uikt_eshop.models.products;

import com.example.uikt_eshop.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CPU;

    private String RAM;

    private String storage;

    private String GPU;

    private Long weightInKg;

    private String operatingSystem;

    private String dimensions;

}
