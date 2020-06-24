package com.springboot.rabbitmq.components;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class Receiver {
    //  @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(String msg) {
        System.out.println("Receiver:" + msg+ "---"+new Date());
    }


}
