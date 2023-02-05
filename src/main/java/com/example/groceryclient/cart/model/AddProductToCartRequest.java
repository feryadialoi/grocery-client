package com.example.groceryclient.cart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddProductToCartRequest {
    private Long customerId;
    private Long productId;
    private Integer quantity;
}
