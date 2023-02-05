package com.example.groceryclient.customer;

import com.example.groceryclient.customer.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;


@HttpExchange("/api/v1/customers")
public interface CustomerClient {
    @GetExchange("/{id}")
    GetCustomerResponse getCustomer(@PathVariable Long id);

    @PostExchange
    CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest request);

    @PutExchange("/{id}")
    UpdateCustomerResponse updateCustomer(@PathVariable Long id, @RequestBody UpdateCustomerRequest request);
}
