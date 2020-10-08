package com.serverless.demo.controllers;
import java.util.UUID;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class UniqueIdController {
	
	/**
	 * 
	 * @return a random unique id
	 * @see java.util.UUID
	 */
	@GetMapping("/util/uid")
	public ResponseEntity<String> getUniqueId()
	{
		System.out.println("Request Received");
		ResponseEntity<String> entity = new ResponseEntity<>(UUID.randomUUID().toString(),HttpStatus.OK);
		
		return entity;
		
	}
	
}
