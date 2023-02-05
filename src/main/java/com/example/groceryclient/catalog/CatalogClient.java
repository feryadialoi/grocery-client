package com.example.groceryclient.catalog;

import com.example.groceryclient.catalog.model.GetCatalogResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/api/v1/catalogs")
public interface CatalogClient {
    @GetExchange
    GetCatalogResponse getCatalog();
}
