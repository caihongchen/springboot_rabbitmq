package cn.baizhi.cai;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.expression.spel.SpelMessage;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class rabbitmq {

    @RabbitHandler
    public void consumer(String massage){
        System.out.println("消费者" + massage);
    }

}
