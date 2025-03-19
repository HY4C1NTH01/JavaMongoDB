package com.example.demo2.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {

    @Id
    private Integer _id;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

}
