package com.example.groceryclient.catalog;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "catalog-client")
public class CatalogClientConfig {
    private String baseUrl;
}
