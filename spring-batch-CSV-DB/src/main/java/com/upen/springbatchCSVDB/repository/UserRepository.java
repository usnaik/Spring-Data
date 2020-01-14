package com.upen.springbatchCSVDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upen.springbatchCSVDB.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
