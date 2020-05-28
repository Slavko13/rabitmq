package com.test.rabitmq.rabbit;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;

@Component
public class Producer {

    private String queue = "queue2";
    private String topicExchange = "direct";
    private String routingKey = "orange";


    @Bean
    public Queue queue() {
        return new Queue(queue, false);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(topicExchange);
    }

    @Bean
    public Binding binding2(Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(routingKey);
    }

}
