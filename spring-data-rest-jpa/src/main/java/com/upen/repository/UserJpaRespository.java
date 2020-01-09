package com.upen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.upen.model.User;

@Component
public interface UserJpaRespository extends JpaRepository<User, Long>{

    User findByName(String name);
}
