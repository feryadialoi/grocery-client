package com.example.groceryclient.cart;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "cart-client")
public class CartClientConfig {
    private String baseUrl;
}
