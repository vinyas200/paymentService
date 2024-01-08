package com.example.paymentservicefinal.paymentgateways;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, String email,
                               String phoneNumber, Long amount);
}
