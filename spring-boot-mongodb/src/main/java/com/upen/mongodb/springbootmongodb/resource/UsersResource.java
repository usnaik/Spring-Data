package com.upen.mongodb.springbootmongodb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upen.mongodb.springbootmongodb.document.Users;
import com.upen.mongodb.springbootmongodb.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

	@Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
