package com.email.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
     private EmailService emailservice;
	 //Sending a simple email
	@PostMapping("/sendMail")
	public String
	sendMail(@RequestBody EmailDetails details) {
		String status = emailservice.sendSimpleMail(details);
		return status;
	
	}

}
