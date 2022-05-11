package com.example.uikt_eshop.models.products;

import com.example.uikt_eshop.models.Category;
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
public class Keyboard extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean spillResistant;

    private Boolean isGaming;

    private Long cableLengthInCm;

    private Integer numberOfKeys;

    public Keyboard(String name, Double price, Category category, Boolean spillResistant, Boolean isGaming, Long cableLengthInCm, Integer numberOfKeys) {
        super(name, price, category);
        this.spillResistant = spillResistant;
        this.isGaming=isGaming;
        this.cableLengthInCm = cableLengthInCm;
        this.numberOfKeys = numberOfKeys;
    }
}