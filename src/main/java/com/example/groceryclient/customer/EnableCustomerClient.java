package com.example.groceryclient.customer;

import org.springframework.context.annotation.Import;

@Import({CustomerClientAutoConfiguration.class})
public @interface EnableCustomerClient {
}
