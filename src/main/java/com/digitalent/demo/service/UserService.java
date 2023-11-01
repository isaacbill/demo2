package com.digitalent.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalent.demo.model.Users;
import com.digitalent.demo.repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<Users> getAllUsers(){
		List<Users> users = new ArrayList<Users>();  
		userRepo.findAll().forEach(users1 -> users.add(users1));  
		return users;
		}  
	public Users getUsersById(int id)   
	{  
	return userRepo.findById(id).get();  
	}  
	//saving a specific record by using the method save() of JpaRepository  
	public void saveOrUpdate(Users users)   
	{  
		userRepo.save(users);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		userRepo.deleteById(id);  
	}  
	//updating a record  
	public void update(Users users, int id)   
	{  
		userRepo.save(users);  
	}  
	}
	
