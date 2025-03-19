package com.example.demo2.service;

import com.example.demo2.models.UserLogin;
import com.example.demo2.DTO.UserRequest;
import com.example.demo2.rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplic implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(UserRequest request) {
        UserLogin user = new UserLogin();
        user.set_id(request.get_id());
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());
        userRepository.save(user);

        return "user created successfully";
    }

    @Override
    public UserLogin getById(Integer roo){
        return userRepository.findById(roo).get();
    }

    @Override
    public List<UserLogin> getAllUsers() {
        return List.of();
    }

    @Override
    public List<UserLogin> getAllUsers(UserLogin user) {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer roo) {
        userRepository.deleteById(roo);
    }

    @Override
    public List<UserLogin> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
