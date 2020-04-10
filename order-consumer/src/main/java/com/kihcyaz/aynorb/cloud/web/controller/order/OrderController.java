package com.kihcyaz.aynorb.cloud.web.controller.order;

import com.kihcyaz.aynorb.cloud.common.vo.ServerResponse;
import com.kihcyaz.aynorb.cloud.order.service.OrderService;
import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public ServerResponse<Payment> create(@RequestBody Payment payment) {
        return orderService.createOrder(payment);
    }

    @GetMapping("/{paymentId}")
    public ServerResponse<Payment> findById(@PathVariable("paymentId") Long paymentId) {
        return orderService.findById(paymentId);
    }

}
