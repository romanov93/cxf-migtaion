package com.example.cxfmigration.controller;

import com.example.cxfmigration.api.UserController;
import com.example.cxfmigration.model.User;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    private List<User> testUsers = List.of(
            new User(1, "Bob"),
            new User(2, "Emmy"),
            new User(3,"Ivan")
    );
    @Override
    public List<User> listUsers() {
        return testUsers;
    }

    @Override
    public User userById(Integer id) {
        return testUsers.get(id - 1);
    }
}
