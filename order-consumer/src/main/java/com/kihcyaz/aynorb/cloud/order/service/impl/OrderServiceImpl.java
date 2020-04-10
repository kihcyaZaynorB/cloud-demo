package com.kihcyaz.aynorb.cloud.order.service.impl;

import com.kihcyaz.aynorb.cloud.common.vo.ServerResponse;
import com.kihcyaz.aynorb.cloud.order.service.OrderService;
import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ServerResponse<Payment> findById(Long paymentId) {
        return restTemplate.getForObject(String.format("http://localhost:8080/payment/get/%d", paymentId), ServerResponse.class);
    }

    @Override
    public ServerResponse<Payment> createOrder(Payment payment) {
        return restTemplate.postForObject("http://localhost:8080/payment/create", payment, ServerResponse.class);
    }
}
