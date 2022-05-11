package com.example.uikt_eshop.web;

import com.example.uikt_eshop.models.ShoppingCart;
import com.example.uikt_eshop.service.ShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("api/shoppingCart")
//public class ShoppingCartController {
//    private final ShoppingCartService shoppingCartService;
//
//    public ShoppingCartController(ShoppingCartService shoppingCartService) {
//        this.shoppingCartService = shoppingCartService;
//    }
//
//    @GetMapping
//    public ShoppingCart getShoppingCart(String username){
//        return shoppingCartService.getActiveShoppingCart(username);
//    }
//
//    @PostMapping("/add-product/{id}")
//    public String addProductToShoppingCart(){
//        return
//    }
//}
