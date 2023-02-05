package com.example.groceryclient.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProductResponse {
    private Long id;
    private String name;
    private String imageUrl;
    private ProductCategoryResponse category;
}
