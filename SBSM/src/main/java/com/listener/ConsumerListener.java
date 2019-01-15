package com.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "xiong.test.queue")
public class ConsumerListener {


    @RabbitHandler
    public void process(String message){
        System.out.println(message);
    }
}
