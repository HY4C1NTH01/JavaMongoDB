package com.example.demo2.rep;

import com.example.demo2.models.UserLogin;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<UserLogin, Integer> {


    List<UserLogin> findByEmail(String email);
}