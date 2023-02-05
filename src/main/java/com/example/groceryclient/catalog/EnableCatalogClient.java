package com.example.groceryclient.catalog;

import org.springframework.context.annotation.Import;

@Import({CatalogClientAutoConfiguration.class})
public @interface EnableCatalogClient {
}
