package com.upen.springbatchCSVDB.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upen.springbatchCSVDB.model.User;
import com.upen.springbatchCSVDB.repository.UserRepository;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data Saved for " + users.size() + " Users: " + users);
        userRepository.save(users);
    }
}
