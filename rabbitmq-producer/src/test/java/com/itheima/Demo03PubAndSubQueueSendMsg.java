package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 发布订阅模式(广播模式),一个生成者多个消费者接收任务,每个消费者都接到相同的消息,
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo03PubAndSubQueueSendMsg {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
        //向广播交换机发送1千条消息
        for (int i = 0; i < 1000; i++) {
            /**
             * 参数1：交换机名称
             * 参数2：路由键,广播模式不设置路由键,默认空字符串
             * 参数3：消息内容
             */
            rabbitTemplate.convertAndSend("fanout_exchange","","hello 我是小兔子【"+i+"】！");
        }
    }
}
