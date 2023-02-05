package com.example.groceryclient.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


public class CustomerClientAutoConfiguration {
    @Bean
    public CustomerClient customerClient(CustomerClientConfig config) {
        WebClient webClient = WebClient.builder()
                .baseUrl(config.getBaseUrl())
                .build();

        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(CustomerClient.class);
    }
}
