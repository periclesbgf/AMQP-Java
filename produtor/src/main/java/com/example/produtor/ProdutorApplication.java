package com.example.produtor;


import org.springframework.amqp.core.DirectExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProdutorApplication {

	 static final String directExchangeName = "direct-exchange";
	 static final String routingKey = "rota-dois";

	 @Bean
	 DirectExchange exchange() {
	      return new DirectExchange(directExchangeName,false, true);
	 }


	public static void main(String[] args) {
		SpringApplication.run(ProdutorApplication.class, args);
	}
}