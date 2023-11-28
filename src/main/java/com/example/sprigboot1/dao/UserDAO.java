package com.example.sprigboot1.dao;



import com.example.sprigboot1.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    User findUser(long id);
    List<User> getUserTable();

}
