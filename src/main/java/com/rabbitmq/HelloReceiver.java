package com.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Project: boot-rabbitmq
 * Package: com.rabbitmq
 * Title: fileName
 * author: xianzhongping
 * date: 2018/6/26 17:47
 * Copyright: 2018 www.yineng.com.cn Inc. All rights reserved.
 * version V1.0
 */
@Component
public class HelloReceiver {
    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(String hello){

        System.out.println("Receiver: "+hello);
    }
    @RabbitHandler
    @RabbitListener(queues = "topic.message")
    public void message(String string){
        System.out.println("Receiver："+string);
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.messages")
    public void messages(String string){
        System.out.println("Receiver："+string);
    }
}
