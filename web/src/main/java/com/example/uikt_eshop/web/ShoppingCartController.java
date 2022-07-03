package com.example.uikt_eshop.web;

import com.example.uikt_eshop.models.ShoppingCart;
import com.example.uikt_eshop.service.ShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/shoppingCart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/{id}")
    public ShoppingCart getShoppingCart(@PathVariable Long id){
        return shoppingCartService.getActiveShoppingCart(id);
    }

//    @PostMapping("/add-product/{id}")
//    public String addProductToShoppingCart(){
//        return;
//    }
}
