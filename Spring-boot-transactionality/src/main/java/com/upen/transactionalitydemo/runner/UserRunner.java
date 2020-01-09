package com.upen.transactionalitydemo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.upen.transactionalitydemo.model.User;
import com.upen.transactionalitydemo.service.UserService;

import java.util.Arrays;

@Component
public class UserRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {

        try {
            User user1 = new User("Peter", "Ops", 12000L);
            User user2 = new User("Sam", "Tech", 22000L);
            userService.insert(Arrays.asList(
                    user1, user2
            ));
        }
        catch (RuntimeException exception) {
            System.out.println("Exception in batch 1...!" + exception.getMessage());
        }


        try {
            User user3 = new User("Ryan King", "Tech", 32000L);
            User user4 = new User("Nick", "Ops", 18000L);
            userService.insert(Arrays.asList(
                    user3, user4
            ));
        }
        catch (RuntimeException exception) {
            System.out.println("Exception in batch 2...!" + exception.getMessage());
        }
        System.out.println(userService.getUsers());
    }
}
