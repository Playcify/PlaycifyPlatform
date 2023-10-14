package com.aerossolutions.userservice.presentation;

import com.aerossolutions.userservice.domain.User;
import com.aerossolutions.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<User> createUser(){
        User user = userService.createUser("user", "user@example.com", "password");
        ResponseEntity response = new ResponseEntity(user, HttpStatus.OK);
        return response;
    }
}
