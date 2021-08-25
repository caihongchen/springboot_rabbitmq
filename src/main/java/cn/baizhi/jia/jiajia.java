package cn.baizhi.jia;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queuesToDeclare = @Queue("jiajia"))
public class jiajia {

    @RabbitHandler
    public void testjiajia(String message){
        System.out.println("消息：   "+message  );
    }



}
