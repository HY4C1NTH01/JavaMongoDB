package com.example.demo2.controller;



import com.example.demo2.DTO.UserRequest;
import com.example.demo2.models.UserLogin;
import com.example.demo2.rep.UserRepository;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/createNewUser")
    public String createNewUser(@RequestBody UserRequest userRequest){
        return userService.addUser(userRequest);
    }

    @GetMapping("/getUser/{id}")
    public UserLogin getUser(@PathVariable Integer id){
       return userRepository.findById(id).orElse(null);
    }

    @GetMapping("/getAllUsers")
    public List<UserLogin> getAllUsers(){
        return userRepository.findAll();
    }

    @DeleteMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable Integer id){
        userRepository.deleteById(id);
        return 0;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody UserRequest userRequest){

        UserLogin data = userRepository.findById(userRequest.get_id()).orElse(null);
        System.out.println(data);

        if (data != null){
            data.setName(userRequest.getName());
            data.setEmail(userRequest.getEmail());
            data.setPassword(userRequest.getPassword());
            data.setPhoneNumber(userRequest.getPhoneNumber());
            userRepository.save(data);
        }

        return "User data updated successfully";
    }

    @GetMapping("/findByEmail/{email}")
    public List<UserLogin> findByEmail(@PathVariable String email){
       return userRepository.findByEmail(email);
    }

}
