package com.itheima.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 简单的消息队列,监听器,监听队列中是否有消息,
 * 如果有消息触发接收方法,将消息打印到控制台
 * 必须把监听器器注入spring 的容器中
 */

@Component
@RabbitListener(queues = "simple_queue")
public class SimpleConsumerListener {
    @RabbitHandler //指定当前监听器中方法,处理接收请求
    public void simpleHandler(String msg){
        System.out.println("=====接收消息====>"+msg);
    }
}
