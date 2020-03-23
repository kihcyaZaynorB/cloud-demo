package com.kihcyaz.aynorb.cloud.payment.service;

import com.kihcyaz.aynorb.cloud.payment.entity.Payment;

public interface PaymentService {

    int add(Payment payment);

    Payment findById(Long paymentId);
}
