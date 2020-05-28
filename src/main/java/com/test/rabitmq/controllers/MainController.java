package com.test.rabitmq.controllers;


import com.test.rabitmq.domains.Users;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class MainController {

    Logger logger = Logger.getLogger(String.valueOf(MainController.class));

    @Autowired
    RabbitTemplate rabbitTemplate;

    @RequestMapping("/test")
    @ResponseBody
    public String queue1() {
        logger.info("Emit to queue1");
         Users user = new Users(1, "Tovana", "Viacheslav");
         rabbitTemplate.convertAndSend("direct", "orange", user);
        return "Emit to queue";
    }

}
