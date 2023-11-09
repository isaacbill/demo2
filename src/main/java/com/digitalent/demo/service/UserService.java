package com.digitalent.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.digitalent.demo.model.Users;
import com.digitalent.demo.repository.UserRepository;


@Service
public class UserService implements UserServiceInt {
	@Autowired
	private  UserRepository userRepo;


	@Override
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void saveUser(Users users) {
		this.userRepo.save(users);
	}

	@Override
	public Users getUserById(long id) {
		Optional<Users> optional = userRepo.findById(id);
		Users user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + id);
		}
		return user;
	}

	@Override
	public void deleteUserById(long id) {
		this.userRepo.deleteById(id);
	}

	@Override
	public Page<Users> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.userRepo.findAll(pageable);
	}

	  
  
	}
	
