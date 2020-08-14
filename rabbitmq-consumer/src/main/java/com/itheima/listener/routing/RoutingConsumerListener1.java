package com.itheima.listener.routing;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 路由模式,消费者监听1用于接收routing队列中的消息
 */
@Component
@RabbitListener(queues = "routing_queue1")
public class RoutingConsumerListener1 {

    @RabbitHandler
    public void routingHandler(String msg){
        System.out.println("=====路由模式消息接收监听器【1】=====>"+msg);
    }
}