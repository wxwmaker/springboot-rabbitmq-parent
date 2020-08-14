package com.itheima.listener.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 发布订阅模式(广播模式),消费者监听器1,用于接收fanout队列中的消息
 */

@Component
@RabbitListener(queues = "fanout_queue2")
public class FanoutConsumerListener2 {
    @RabbitHandler
    public void workHandler(String msg){
        System.out.println("=====广播模式接收消息端2====>"+msg);
    }
}
