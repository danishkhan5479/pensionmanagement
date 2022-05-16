package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendEmail(String toEmail, 
			String subject, 
			Stringbody){
		SimpleMailMessage message= new SimpleMailMessage();
		message.setFrom("danishkhan5479@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("mail send successfully........");
	}
	
	

