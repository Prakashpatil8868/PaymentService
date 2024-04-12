package com.example.paymentservice.services;

import com.razorpay.RazorpayException;

public interface PaymentService {
    String createPaymentLink(String orderId) throws Exception;
    String getStatus(String orderId);
}
