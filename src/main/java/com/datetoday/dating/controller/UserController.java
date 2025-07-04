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
	@GetMapping("/allusers")
	public ResponseEntity<?> usersall(){
		return userService.usersall();
	}
	
	@GetMapping("/users/gender/male")
	public ResponseEntity<?> findAllMaleUsers(){
		return userService.findAllMaleUsers();
	}
	
	@GetMapping("users/gender/female")
	public ResponseEntity<?> findAllFemaleUsers(){
		
		return userService.findAllFemaleUsers();
	}
	
	@GetMapping("/users/best-match/{id}/{top}")
	public ResponseEntity<?> findBestMatch(@PathVariable int id ,@PathVariable int top){
		
		return userService.findBestMatch(id,top);
		
	}
	
}
