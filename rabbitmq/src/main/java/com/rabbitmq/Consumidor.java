package com.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumidor {

	@RabbitListener(queues = {"${queue.name}"})
	public void receber(@Payload String body) {
		System.out.println("Mensagem " + body);
	}
}
