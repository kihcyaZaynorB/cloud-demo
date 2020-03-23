package com.kihcyaz.aynorb.cloud.payment.service.impl;

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
    public int add(Payment payment) {
        return paymentDAO.add(payment);
    }

    @Override
    public Payment findById(Long paymentId) {
        return paymentDAO.findById(paymentId);
    }
}
