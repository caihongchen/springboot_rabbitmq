package cn.baizhi.test;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class cai {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void aa(){
        rabbitTemplate.convertAndSend("hello", "helloworld");
    }


}
