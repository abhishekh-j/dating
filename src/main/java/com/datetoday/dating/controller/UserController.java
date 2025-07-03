package com.datetoday.dating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datetoday.dating.entity.User;
import com.datetoday.dating.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<?> saveuser(@RequestBody User u)
	{
		return userService.saveuser(u);
	}
	
}
