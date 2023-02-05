package com.example.groceryclient.product;

import com.example.groceryclient.product.model.GetProductResponse;
import com.example.groceryclient.product.model.GetProductsResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/api/v1/products")
public interface ProductClient {
    @GetExchange("/{id}")
    GetProductResponse getProduct(@PathVariable Long id);

    @GetExchange
    GetProductsResponse getProducts();
}
