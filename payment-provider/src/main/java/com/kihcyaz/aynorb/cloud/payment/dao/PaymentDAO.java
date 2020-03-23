package com.kihcyaz.aynorb.cloud.payment.dao;

import com.kihcyaz.aynorb.cloud.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDAO {

    int add(Payment payment);

    Payment findById(@Param("paymentId") Long paymentId);
}
