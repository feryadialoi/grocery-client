package com.example.groceryclient.cart;

import org.springframework.context.annotation.Import;

@Import({CartClientAutoConfiguration.class})
public @interface EnableCartClient {
}
