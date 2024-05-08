package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.razorpay.RazorpayException;
import com.scaler.groupproject.vehicleservicemanagement.dtos.InitaitePaymentDTO;
import com.scaler.groupproject.vehicleservicemanagement.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String initiatePayment(@RequestBody InitaitePaymentDTO requestDto) throws RazorpayException {
        return paymentService.initiatePayment(
                requestDto.getOrderId(),
                requestDto.getEmail()
        );
    }


}
