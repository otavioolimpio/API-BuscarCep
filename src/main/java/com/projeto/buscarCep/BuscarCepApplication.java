package com.projeto.buscarCep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto gerado via Spring Initializr
 */

@EnableFeignClients
@SpringBootApplication
public class BuscarCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscarCepApplication.class, args);
	}

}
