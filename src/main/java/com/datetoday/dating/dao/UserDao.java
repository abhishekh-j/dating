package com.datetoday.dating.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.datetoday.dating.entity.User;
import com.datetoday.dating.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;

	public User saveuser(User u) {
		
		return userRepository.save(u);
		
	}
	
	
}
