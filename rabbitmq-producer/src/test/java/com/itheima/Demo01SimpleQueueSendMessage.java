package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 简单模式,向消息队列发送一次消息
 * 需要向当前的测试类注入RabbitTemplate对象,来发请求
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01SimpleQueueSendMessage {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void testSendMsg() {
        rabbitTemplate.convertAndSend("simple_queue","hello 小兔子！");
    }

}
