package com.diagnocons.arduino.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.diagnocons.arduino.clients.KafkaFeignClient;
import com.diagnocons.arduino.entity.WhatsappMessage;

@Service
public class KafkaWhatsappSender implements WhatsappSender{


	private KafkaFeignClient kafkaClient;
	
	private static final Logger log = LoggerFactory.getLogger(KafkaWhatsappSender.class);

	
	public KafkaWhatsappSender(KafkaFeignClient kafkaClient) {
		this.kafkaClient = kafkaClient;
	}

	@Override
	public void sendWhatsapp(WhatsappMessage message) {
		log.info("SENDING TO {} TEMPLATE {}", message.getToPhoneNumber(), message.getTemplateName());
		kafkaClient.sendWhatsapp(message);
	}

}
