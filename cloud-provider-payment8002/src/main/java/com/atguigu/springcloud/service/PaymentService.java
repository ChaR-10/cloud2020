package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ChaR
 * @Date: 2021/9/27 17:10
 */
public interface PaymentService {
    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取

}
