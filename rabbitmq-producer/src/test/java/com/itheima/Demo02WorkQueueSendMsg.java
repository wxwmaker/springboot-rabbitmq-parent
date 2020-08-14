package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 工作队列,一个生成者多个消费者接收任务
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo02WorkQueueSendMsg {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {
        //向工作队列发送1千条消息
        for (int i = 0; i < 1000; i++) {
            /**
             * 参数1：消息队列名称
             * 参数2：消息内容
             */
            rabbitTemplate.convertAndSend("work_queue","hello 我是小兔子【"+i+"】！");
        }
    }
}
