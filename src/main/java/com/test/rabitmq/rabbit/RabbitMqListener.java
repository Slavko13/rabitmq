package com.test.rabitmq.rabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@EnableRabbit
public class RabbitMqListener {

    Logger logger = Logger.getLogger(String.valueOf(RabbitMqListener.class));

    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        logger.info("Received from queue 1: " + message);
    }

}
