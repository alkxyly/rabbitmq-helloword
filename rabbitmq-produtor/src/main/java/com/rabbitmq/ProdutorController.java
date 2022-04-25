package com.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtor")
public class ProdutorController {
	
	@Autowired
    private Produtor produtor;
	
	@Autowired
	private  AmqpTemplate queueSender;
	
	@GetMapping
    public String send(@RequestParam String param){
		queueSender.convertAndSend("myExchange", "rounting-key-teste", param);
        return "ok. done";
    }

}
