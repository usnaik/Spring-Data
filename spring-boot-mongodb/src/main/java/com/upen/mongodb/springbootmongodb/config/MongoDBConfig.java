package com.upen.mongodb.springbootmongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.upen.mongodb.springbootmongodb.document.Users;
import com.upen.mongodb.springbootmongodb.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Peter", "Development", 3000L));
            userRepository.save(new Users(2, "Sam", "Operations", 2000L));
            userRepository.save(new Users(3, "Tom", "Development", 2500L));
            userRepository.save(new Users(4, "Kevin", "Development", 3500L));
            userRepository.save(new Users(5, "Toby", "Quality", 5000L));
        };
    }

}
