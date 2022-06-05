package com.example.springboot_crud.service;

import com.example.springboot_crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(int id);
    void updateUser(User user);
    User getUserById(int id);
}
