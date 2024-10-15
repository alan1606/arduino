package com.diagnocons.arduino.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WhatsappMessage {

	private String toPhoneNumber;
	
	private String templateName;
	
	private String[] params;

	
}
