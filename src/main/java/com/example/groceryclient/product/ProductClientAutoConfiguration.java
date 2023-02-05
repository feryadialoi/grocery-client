package com.example.groceryclient.product;

import com.example.groceryclient.customer.CustomerClient;
import com.example.groceryclient.customer.CustomerClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

public class ProductClientAutoConfiguration {
    @Bean
    public ProductClient productClient(ProductClientConfig config) {
        WebClient webClient = WebClient.builder()
                .baseUrl(config.getBaseUrl())
                .build();

        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(ProductClient.class);
    }
}
