package com.Ecommerseapp.PaymentService.service;

import com.Ecommerseapp.PaymentService.model.PaymentRequest;
import com.Ecommerseapp.PaymentService.model.PaymentResponse;
import org.springframework.http.HttpStatus;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
