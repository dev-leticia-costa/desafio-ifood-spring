package com.dio.desafioifood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //habilita o client do feign no projeto
@SpringBootApplication
public class DesafioIfoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioIfoodApplication.class, args);
	}

}
