package com.diagnocons.arduino.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diagnocons.arduino.entity.Message;
import com.diagnocons.arduino.service.ArduinoService;

@RestController
@RequestMapping("/arduino")
public class ArduinoController {

	@Autowired
	private ArduinoService arduinoService;

	@PostMapping
	public ResponseEntity<String> saveData(@RequestBody(required = false) Message message) {
		arduinoService.sendWhatsapps(message);
		return ResponseEntity.ok().build();
	}

}
