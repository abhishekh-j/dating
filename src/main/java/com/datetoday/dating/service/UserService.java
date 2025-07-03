package com.datetoday.dating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.datetoday.dating.dao.UserDao;
import com.datetoday.dating.entity.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public ResponseEntity<?> saveuser(User u) {
		User saveuser = userDao.saveuser(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveuser);
	}

}
