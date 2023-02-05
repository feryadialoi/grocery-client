package com.example.groceryclient.cart;

import com.example.groceryclient.cart.model.AddProductToCartRequest;
import com.example.groceryclient.cart.model.AddProductToCartResponse;
import com.example.groceryclient.cart.model.GetCartResponse;
import com.example.groceryclient.cart.model.RemoveProductFromCartResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange("/api/v1/carts")
public interface CartClient {
    @GetExchange("/customer")
    GetCartResponse getCart(@RequestParam Long customerId);

    @PostExchange("/add-product")
    AddProductToCartResponse addProductToCart(@RequestBody AddProductToCartRequest request);

    @DeleteExchange("/remove-product")
    RemoveProductFromCartResponse removeProductFromCart(@RequestParam Long customerId, @RequestParam Long productId);
}
