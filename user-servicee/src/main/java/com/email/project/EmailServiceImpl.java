package com.email.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public String sendSimpleMail(EmailDetails details) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
