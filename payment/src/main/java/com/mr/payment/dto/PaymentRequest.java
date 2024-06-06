package com.mr.payment.dto;

import com.mr.payment.PaymentMethod;
import com.mr.payment.dto.Customer;

import java.math.BigDecimal;

public record PaymentRequest(
    Integer id,
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    Customer customer
) {
}
