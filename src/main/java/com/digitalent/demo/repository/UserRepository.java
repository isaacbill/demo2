package com.digitalent.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalent.demo.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {

}
