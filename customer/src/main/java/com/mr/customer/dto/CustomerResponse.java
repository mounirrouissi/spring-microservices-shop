package com.mr.customer.dto;

import com.mr.customer.Address;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email,
    Address address
) {

}
