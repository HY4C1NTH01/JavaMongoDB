package com.example.demo2.DTO;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {

    private Integer _id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

}
