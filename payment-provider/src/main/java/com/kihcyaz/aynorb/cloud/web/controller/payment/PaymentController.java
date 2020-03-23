package com.kihcyaz.aynorb.cloud.web.controller.payment;

import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import com.kihcyaz.aynorb.cloud.payment.service.PaymentService;
import com.kihcyaz.aynorb.cloud.payment.vo.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public ServerResponse add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("insert payment: " + payment);
        if (result > 0) {
            return new ServerResponse(200, "add payment success", payment);
        }
        return new ServerResponse(400, "add payment failed");
    }

    @GetMapping("/get/{paymentId}")
    public ServerResponse findById(@PathVariable("paymentId") Long paymentId) {
        Payment payment = paymentService.findById(paymentId);
        if (payment == null) {
            return new ServerResponse(400, "payment not found");
        }
        return new ServerResponse(200, "success", payment);
    }
}
