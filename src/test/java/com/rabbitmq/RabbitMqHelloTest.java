package com.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Project: boot-rabbitmq
 * Package: com.rabbitmq
 * Title: fileName
 * author: xianzhongping
 * date: 2018/6/26 17:54
 * Copyright: 2018 www.yineng.com.cn Inc. All rights reserved.
 * version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
    private HelloSenderService helloSenderService;

   /* @Test
    public void testGetEntFileById(){
        System.out.println("11111111111111111");
//        Assert.assertSame("企业数量有误",500,0);
    }*/
   @Test
   public void hello()throws Exception{
       helloSenderService.send();
   }

   @Test
   public void topic(){
       for(int i =0;i<10;i++){
           helloSenderService.send1();
           helloSenderService.send2();
       }
   }


}
