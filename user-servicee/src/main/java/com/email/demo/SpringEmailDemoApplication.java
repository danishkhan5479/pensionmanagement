package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {
	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
		
	}
      
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		String toEmail;
		String subject;
		Object body;
		senderService.sendEmail(toEmail "danishkhan5479@gmail.com", subject "This is subject", body "This is the body of email" );
		
		
	}
}
