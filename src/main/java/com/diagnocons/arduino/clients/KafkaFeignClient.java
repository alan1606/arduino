package com.diagnocons.arduino.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservicio-kafka")
public interface KafkaFeignClient {
	
	@PostMapping("/whatsapp")
	public void sendWhatsapp(@RequestBody Object message);
}
