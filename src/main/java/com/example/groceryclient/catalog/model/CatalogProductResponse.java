package com.example.groceryclient.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatalogProductResponse {
    private Long id;
    private String name;
    private CatalogProductCategoryResponse category;
}
