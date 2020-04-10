package com.kihcyaz.aynorb.cloud.order.service;

import com.kihcyaz.aynorb.cloud.common.vo.ServerResponse;
import com.kihcyaz.aynorb.cloud.payment.entity.Payment;

public interface OrderService {

    ServerResponse<Payment> findById(Long paymentId);

    ServerResponse<Payment> createOrder(Payment payment);
}
