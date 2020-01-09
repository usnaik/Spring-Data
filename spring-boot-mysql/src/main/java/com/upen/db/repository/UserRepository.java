package com.upen.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upen.db.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
