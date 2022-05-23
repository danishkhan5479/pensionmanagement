package com.email.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void saveUser(Users users) {
		System.out.println(users);
	}
}
