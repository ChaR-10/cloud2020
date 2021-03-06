package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: ChaR
 * @Date: 2021/9/30 13:48
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springCloud with consul: " + serverPort + "\t  " + UUID.randomUUID().toString();
    }

}
