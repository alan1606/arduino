package com.diagnocons.arduino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diagnocons.arduino.entity.ContactoAvisar;
import com.diagnocons.arduino.entity.Message;
import com.diagnocons.arduino.entity.WhatsappMessage;
import com.diagnocons.arduino.repository.ContactoAvisarRepository;

@Service
public class ArduinoServiceImpl implements ArduinoService{

	@Autowired
	private WhatsappSender whatsappSender;

	@Autowired
	private ContactoAvisarRepository contactoAvisarRepository;
	
	@Override
	public void sendWhatsapps(Message message) {
		
		List<ContactoAvisar> contactos = (List<ContactoAvisar>) contactoAvisarRepository.findAll();
		
		for(var contacto: contactos) {
			whatsappSender.sendWhatsapp(
					WhatsappMessage.builder()
					.toPhoneNumber(contacto.getWhatsapp())
					.templateName("avisoluzcaida")
					.build()
			);
		}
		
	}

	
	
}
