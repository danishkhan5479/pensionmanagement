package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendEmail(EmailDetails emailDetails){
		
		SimpleMailMessage message= new SimpleMailMessage();
		message.setFrom("danish5479anjum@gmail.com");
		message.setTo(emailDetails.getRecipient());
		System.out.println("Recipent mail Id "+ emailDetails.getRecipient()+"---------");
		message.setText(emailDetails.getMsgBody());
		System.out.println("mail Body........"+emailDetails.getMsgBody()+"-------" );
		message.setSubject(emailDetails.getSubject());
		System.out.println("mail Initiated successfully........");
		mailSender.send(message);
		System.out.println("mail send successfully........");
	}
}
	

