package com.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProdutorConfig {
	
	@Value("${queue.name}")
    private String message;

	
	@Bean
    public Queue queue() {
        return new Queue(message, true);
    }
}
