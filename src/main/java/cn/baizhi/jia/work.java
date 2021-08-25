package cn.baizhi.jia;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class work {


    //创建第一个消费者
    @RabbitListener(queuesToDeclare = @Queue("hello"))
    public void rece(String message){

        System.out.println("第一个消费者消费:    "+message);
    }


    //创建第二个消费者
    @RabbitListener(queuesToDeclare = @Queue("hello"))
    public void rece2(String message){
        System.out.println("第二个消费者消费:   "+message);
    }


}
