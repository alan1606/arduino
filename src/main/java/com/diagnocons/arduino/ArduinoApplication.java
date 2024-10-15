package com.diagnocons.arduino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArduinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArduinoApplication.class, args);
	}

}
