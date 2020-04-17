package com.kihcyaz.aynorb.cloud.payment.service.impl;

import com.kihcyaz.aynorb.cloud.common.vo.ServerResponse;
import com.kihcyaz.aynorb.cloud.payment.dao.PaymentDAO;
import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import com.kihcyaz.aynorb.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;

    @Override
    public ServerResponse<Payment> create(Payment payment) {
        int result = paymentDAO.create(payment);
        if (result > 0) {
            return new ServerResponse<>(200, "success", payment);
        }
        return new ServerResponse<>(400, "failed");
    }

    @Override
    public ServerResponse<Payment> findById(Integer paymentId) {
        Payment payment = paymentDAO.findById(paymentId);
        if (payment != null) {
            return new ServerResponse<>(200, "success", payment);
        }
        return new ServerResponse<>(400, "failed");
    }
}
