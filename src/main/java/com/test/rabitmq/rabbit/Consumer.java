package com.test.rabitmq.rabbit;

import com.test.rabitmq.controllers.MainController;
import com.test.rabitmq.domains.Users;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Consumer {

    Logger logger = Logger.getLogger(String.valueOf(Consumer.class));


    @RabbitListener(queues = "queue2")
    public void consume(Users user) {
        logger.info(user.getLogin());
    }


}
