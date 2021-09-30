package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ChaR
 * @Date: 2021/9/30 17:12
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //自定义负载均衡算法或者选择Ribbon的其他负载均衡算法，这里选择了随机算法
    }

}