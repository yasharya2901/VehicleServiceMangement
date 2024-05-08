package com.scaler.groupproject.vehicleservicemanagement.services;

import com.razorpay.RazorpayException;
import com.scaler.groupproject.vehicleservicemanagement.paymentGateways.PaymentGateways;
import com.scaler.groupproject.vehicleservicemanagement.paymentGateways.RazorPayPaymentGateway;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {
    private PaymentGateways paymentGateways;
    PaymentService(PaymentGateways paymentGateways) {
        this.paymentGateways = paymentGateways;
    }
    public String initiatePayment(Long orderId, String email) throws RazorpayException {
        return paymentGateways.generatePaymentLink(orderId, email);
    }

}
