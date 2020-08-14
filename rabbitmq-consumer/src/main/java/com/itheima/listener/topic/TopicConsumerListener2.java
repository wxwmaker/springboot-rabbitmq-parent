package com.itheima.listener.topic;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 路由模式,消费者监听1用于接收routing队列中的消息
 */
@Component
@RabbitListener(queues = "topic_queue2")
public class TopicConsumerListener2 {

    @RabbitHandler
    public void routingHandler(String msg){
        System.out.println("=====通配符模式消息接收监听器【2】=====>"+msg);
    }
}