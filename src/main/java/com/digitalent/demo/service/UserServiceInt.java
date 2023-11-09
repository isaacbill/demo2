package com.digitalent.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.digitalent.demo.model.Users;


public interface UserServiceInt {
	List<Users> getAllUsers();
	void saveUser(Users users);
	Users getUserById(long id);
	void deleteUserById(long id);
	Page<Users> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
