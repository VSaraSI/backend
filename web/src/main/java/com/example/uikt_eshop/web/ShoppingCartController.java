package com.example.uikt_eshop.web;


import com.example.uikt_eshop.models.ShoppingCart;
import com.example.uikt_eshop.service.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/shoppingCart")
public class ShoppingCartController {


    private final ShoppingCartService shoppingCartService;


    @GetMapping("/{id}")
    public ShoppingCart getShoppingCart(@PathVariable Long id){
        return this.shoppingCartService.getShoppingCart(id.intValue());
    }

    @PostMapping("/add-product/{id}")
    public void addProductToShoppingCart(@PathVariable Long id,
                                           Long productId){
        this.shoppingCartService
                .addProductToShoppingCart(id.intValue(), productId);
    }
}
