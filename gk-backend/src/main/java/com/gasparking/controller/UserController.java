package com.gasparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gasparking.model.User;
import com.gasparking.repository.UserRepository;

@RestController
@RequestMapping(value="/user", produces="application/json")
public class UserController {
	@Autowired
	UserRepository repository;
	
	@CrossOrigin
	@RequestMapping(value="/save", method = RequestMethod.GET)
	public String saveUser() {
		repository.save(new User("Alan","Gasper","Castell","retro@gmail.com","12345"));
		repository.save(new User("Luis","Iñiguez","Salcedo","retro@gmail.com","12345"));
		return "Datos guardados";
	}
}
