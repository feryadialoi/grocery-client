package com.example.groceryclient.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class UpdateCustomerResponse {
    private Long id;
    private String name;
    private String email;
    private String address;
}
