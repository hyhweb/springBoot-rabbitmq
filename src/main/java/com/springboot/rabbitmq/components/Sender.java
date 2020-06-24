package com.springboot.rabbitmq.components;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String msg = "hello rabbitmq: send msg" + new Date();
        System.out.println("Sender:" + msg);
        this.amqpTemplate.convertAndSend("hello", msg);
    }

    public void sendMsg(String msg) {
        System.out.println("Sender:" + msg+ "---"+new Date());
        this.amqpTemplate.convertAndSend("hello", msg);
    }
}
