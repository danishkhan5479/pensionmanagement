package com.email.project;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
	String sendSimpleMail(EmailDetails details);
	
	}

