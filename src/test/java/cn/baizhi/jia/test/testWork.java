package cn.baizhi.jia.test;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testWork {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test(){

        for (int i = 0; i < 12; i++) {

            rabbitTemplate.convertAndSend("hello", "第"+i+"消息");
        }


    }



}
