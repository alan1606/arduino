package com.diagnocons.arduino.service;

import com.diagnocons.arduino.entity.WhatsappMessage;

public interface WhatsappSender {

	void sendWhatsapp(WhatsappMessage message);
}
