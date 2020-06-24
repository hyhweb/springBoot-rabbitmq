package com.springboot.rabbitmq;

import com.springboot.rabbitmq.components.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {
    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
        sender.send();
    }

}
