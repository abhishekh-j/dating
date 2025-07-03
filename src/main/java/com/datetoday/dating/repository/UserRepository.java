package com.datetoday.dating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datetoday.dating.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
