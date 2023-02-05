package com.example.groceryclient.product;

import org.springframework.context.annotation.Import;

@Import({ProductClientAutoConfiguration.class})
public @interface EnableProductClient {
}
