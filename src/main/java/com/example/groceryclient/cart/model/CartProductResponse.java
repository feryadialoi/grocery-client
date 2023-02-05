package com.example.groceryclient.cart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartProductResponse {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer quantity;
}
