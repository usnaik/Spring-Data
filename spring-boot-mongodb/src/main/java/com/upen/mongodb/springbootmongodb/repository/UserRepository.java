package com.upen.mongodb.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.upen.mongodb.springbootmongodb.document.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {
}
