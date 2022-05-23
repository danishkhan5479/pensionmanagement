package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired
	 EmailService emailService;
	
	@PostMapping("/sendEmail")
	public void sendMail(@RequestBody EmailDetails emailDetails) {
		emailService.sendEmail(emailDetails);
	}

}
