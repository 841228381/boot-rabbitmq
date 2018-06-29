package com.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Project: boot-rabbitmq
 * Package: com.rabbitmq
 * Title: fileName
 * author: xianzhongping
 * date: 2018/6/26 18:58
 * Copyright: 2018 www.yineng.com.cn Inc. All rights reserved.
 * version V1.0
 */
@Service("helloSenderServiceImpl")
public class HelloSenderServiceImpl implements HelloSenderService{
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello "+new Date();
        System.out.println("Sender : " +context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }

    public void send1(){
        String context = "hi,i an message 1";
        System.out.println("Sender："+context);
        this.rabbitTemplate.convertAndSend("exchange","topic.message",context);
    }

    public void send2(){
        String context = "hi,i am messages 2";
        System.out.println("Sender："+context);
        this.rabbitTemplate.convertAndSend("exchange","topic.messages",context);
    }
}
