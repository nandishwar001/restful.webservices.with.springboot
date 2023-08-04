package com.springboot.rest.webservices.restfulwebservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.webservices.restfulwebservice.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
