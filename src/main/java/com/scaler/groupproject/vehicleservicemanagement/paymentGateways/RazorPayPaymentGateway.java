package com.scaler.groupproject.vehicleservicemanagement.paymentGateways;

import com.razorpay.*;
import lombok.Value;
import org.json.JSONObject;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Component;

@Component
public class RazorPayPaymentGateway implements  PaymentGateways {

    @Override
    public String generatePaymentLink(Long orderId, String email) throws RazorpayException {
        String razorpayKeyId = "${razorpay.key.id}";
        String razorpayKeySecret = "${razorpay.key.secret}";

        RazorpayClient razorpay = new RazorpayClient("rzp_test_ISqLrD3QMBWGUF", "60vJvLldayPoI49SwMDd06lI");
        JSONObject paymentLinkRequest = new JSONObject();

        //43.56 -> 43.56 * 100 => 4356
        paymentLinkRequest.put("amount",600000);
        paymentLinkRequest.put("currency","INR");
        long currentTimeInSeconds = System.currentTimeMillis() / 1000; // Current time in seconds
        long expireBy = currentTimeInSeconds + (3 * 24 * 60 * 60); // Add 3 days in seconds
        paymentLinkRequest.put("expire_by", expireBy);
        paymentLinkRequest.put("reference_id", "Russians_60000_only");
        paymentLinkRequest.put("description","Sample payment link for Vehicle Service Management");
        JSONObject customer = new JSONObject();
        customer.put("name","+919000090000");
        customer.put("contact","Daddy ji");
        customer.put("email", email);
        paymentLinkRequest.put("customer",customer);
        JSONObject notify = new JSONObject();
        notify.put("sms",true);
        notify.put("email",true);
        paymentLinkRequest.put("notify",notify);
        paymentLinkRequest.put("reminder_enable",true);
        paymentLinkRequest.put("callback_url","https://scaler.com/");
        paymentLinkRequest.put("callback_method","get");

        PaymentLink payment = razorpay.paymentLink.create(paymentLinkRequest);
        return payment.toString();
    }
}
