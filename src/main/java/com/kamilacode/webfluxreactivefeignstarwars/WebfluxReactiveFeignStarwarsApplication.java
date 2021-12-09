package com.kamilacode.webfluxreactivefeignstarwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@EnableReactiveFeignClients
@SpringBootApplication
public class WebfluxReactiveFeignStarwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxReactiveFeignStarwarsApplication.class, args);
	}

}
