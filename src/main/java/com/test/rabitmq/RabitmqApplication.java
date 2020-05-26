package com.test.rabitmq;

import com.test.rabitmq.config.RabbitConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@Import(RabbitConfiguration.class)
@SpringBootApplication
public class RabitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabitmqApplication.class, args);
	}

}
