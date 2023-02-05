package com.example.groceryclient.product;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "product-config")
public class ProductClientConfig {
    private String baseUrl;
}
