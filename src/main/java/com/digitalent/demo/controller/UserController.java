package com.digitalent.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalent.demo.model.Users;
import com.digitalent.demo.service.UserService;

@RestController
public class UserController {
	
 
		@Autowired  
		UserService userService; 
		
		
		@GetMapping("/user")  
		private List<Users> getAllUsers()   
		{  
		return userService.getAllUsers();  
		}  
	  
		@GetMapping("/user/{id}")  
		private Users getUsers(@PathVariable("id") int id)   
		{  
		return userService.getUsersById(id);  
		}  
	 
		@DeleteMapping("/users/{id}")  
		private void deleteBook(@PathVariable("id") int id)   
		{  
			userService.delete(id);  
		}  
	 
		@PostMapping("/users")  
		private int saveUser(@RequestBody Users users)   
		{  
			userService.saveOrUpdate(users);  
		return users.getId();  
		}  
  
		@PutMapping("/users")  
		private Users update(@RequestBody Users users)   
		{  
			userService.saveOrUpdate(users);  
		return users;  
		}  

}
