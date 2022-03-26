package com.example.uikt_eshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    private Category category;

    @Nullable
    private String CPU;

    @Nullable
    private String RAM;

    @Nullable
    private String storage;

    @Nullable
    private String GPU;

    @Nullable
    private String weight;

    @Nullable
    private String operatingSystem;

    @Nullable
    private String dimensions;
}
