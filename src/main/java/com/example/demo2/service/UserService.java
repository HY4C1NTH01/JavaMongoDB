package com.example.demo2.service;

import com.example.demo2.DTO.UserRequest;
import com.example.demo2.models.UserLogin;

import java.util.List;

public interface UserService {
    String addUser(UserRequest request);

    UserLogin getById(Integer roo);

    List<UserLogin> getAllUsers();

    List<UserLogin> getAllUsers(UserLogin user);

    void deleteUser(Integer roo);

    List<UserLogin> findByEmail(String email);
}
