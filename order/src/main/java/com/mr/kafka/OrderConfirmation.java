package com.mr.kafka;

import com.mr.customer.CustomerResponse;
import com.mr.order.PaymentMethod;
import com.mr.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
