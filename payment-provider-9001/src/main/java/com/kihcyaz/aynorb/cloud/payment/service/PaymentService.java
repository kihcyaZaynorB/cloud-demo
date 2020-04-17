package com.kihcyaz.aynorb.cloud.payment.service;

import com.kihcyaz.aynorb.cloud.common.vo.ServerResponse;
import com.kihcyaz.aynorb.cloud.payment.entity.Payment;

public interface PaymentService {

    ServerResponse<Payment> create(Payment payment);

    ServerResponse<Payment> findById(Integer paymentId);
}
