package com.example.paymentservicefinal.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDTO {
    private String email;
    private String phoneNumber;
    private Long amount;
    private String orderId;
}
