package com.example.groceryclient.cart;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

public class CartClientAutoConfiguration {
    @Bean
    public CartClient customerClient(CartClientConfig config) {
        WebClient webClient = WebClient.builder()
                .baseUrl(config.getBaseUrl())
                .build();

        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(CartClient.class);
    }
}
