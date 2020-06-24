package com.springboot.rabbitmq.controller;

import com.springboot.rabbitmq.components.Receiver;
import com.springboot.rabbitmq.components.Sender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMsgController {

    @Autowired
    private Sender sender;

    @GetMapping("/sender")
    public String SendMsg(String msg) {
        sender.sendMsg(msg);
        return "发送成功:" + msg;
    }

    @GetMapping("/get")
    public String getMsg(String msg) {
        return msg;
    }


}
