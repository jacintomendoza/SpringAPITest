package com.example.SpringAPITest.service;

import com.example.SpringAPITest.api.model.User;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    // Hard-coded database
    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Ida",32,"ida@mail.com");
        User user2 = new User(2, "John", 28, "john@mail.com");
        User user3 = new User(3, "Alice", 35, "alice@mail.com");
        User user4 = new User(4, "Bob", 40, "bob@mail.com");
        User user5 = new User(5, "Eve", 27, "eve@mail.com");
        User user6 = new User(6, "Charlie", 30, "charlie@mail.com");
        User user7 = new User(7, "Grace", 33, "grace@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6,user7));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
