package com.datetoday.dating.entity;

import java.util.List;

import com.datetoday.dating.util.UserGender;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private int age;
	@Enumerated(EnumType.STRING)
	private UserGender gender;
	
	@ElementCollection     //we cant use onetomany because String is not a entity class
	private List<String> interests;
}
