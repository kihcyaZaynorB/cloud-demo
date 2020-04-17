package com.kihcyaz.aynorb.cloud.payment.dao;

import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDAO {

    int create(Payment payment);

    Payment findById(Integer paymentId);
}
