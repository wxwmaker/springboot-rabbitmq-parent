package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 通配符模式,一个生产者,多个消费者接收任务
 * 通过路由键指定接收消息的消费者(info.error),路由键不是字符串,而是字符串带着统配符* #
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo05TopicQueueSendMsg {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {


            //向通配符交换机发送消息
            rabbitTemplate.convertAndSend("topic_exchange","item.insert","hello 我是小兔子，路由键item.insert");
            rabbitTemplate.convertAndSend("topic_exchange","item.insert.abc","hello 我是小兔子，路由键：item.insert.abc");
        }
}
