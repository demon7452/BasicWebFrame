package com.web.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MessageProducerController {

    @Resource
    private AmqpTemplate amqpTemplate;

    @GetMapping("add/{message}")
    @ResponseBody
    public String addMessage(@PathVariable("message") String message){

        String queue = "xiong.test.queue";

        amqpTemplate.convertAndSend(queue, message);

        return "success:" + message;
    }
}
