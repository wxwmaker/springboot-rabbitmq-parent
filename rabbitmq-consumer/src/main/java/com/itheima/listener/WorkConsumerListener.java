package com.itheima.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 工作模式消费者监听器1 ,用于接收工作队列中的消息
 */

@Component
@RabbitListener(queues = "work_queue")
public class WorkConsumerListener {
    @RabbitHandler
    public void workHandler(String msg){
        System.out.println("=====工作队列接收消息端1====>"+msg);
    }
}
