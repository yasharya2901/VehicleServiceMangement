package com.scaler.groupproject.vehicleservicemanagement.paymentGateways;

import com.razorpay.RazorpayException;

public interface PaymentGateways {
    public String generatePaymentLink(Long orderId, String email) throws RazorpayException;
}
