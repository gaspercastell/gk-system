package com.gasparking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gasparking.model.User;

public interface UserRepository extends CrudRepository<User,Long>{
	List<User> findByName(String name);
}
