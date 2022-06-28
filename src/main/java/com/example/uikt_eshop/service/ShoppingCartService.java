package com.example.uikt_eshop.service;

import com.example.uikt_eshop.models.Product;
import com.example.uikt_eshop.models.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    List<Product> listAllProductsInShoppingCart(Long cartId);

    ShoppingCart getActiveShoppingCart(Long id);

    ShoppingCart addProductToShoppingCart(String username, Long productId);
}
