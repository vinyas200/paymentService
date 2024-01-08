package com.example.paymentservicefinal.controller;

import com.example.paymentservicefinal.dtos.InitiatePaymentDTO;
import com.example.paymentservicefinal.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentDTO request) {
        return paymentService.initiatePayment(request.getOrderId(),
                request.getEmail(),
                request.getPhoneNumber(),
                request.getAmount());
    }
}
