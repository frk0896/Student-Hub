package com.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
