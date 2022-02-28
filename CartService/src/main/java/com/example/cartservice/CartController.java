package com.example.cartservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping("/getData")
    public String getCartData(){
        return "Response from CART SERVICE";
    }
}
