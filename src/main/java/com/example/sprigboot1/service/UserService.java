package com.example.sprigboot1.service;



import com.example.sprigboot1.model.User;

import java.util.List;


public interface UserService {

    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getUserTable();
    User findUser(long id);
}
