package com.aerossolutions.userservice.service;

import com.aerossolutions.userservice.data.UserRepository;
import com.aerossolutions.userservice.domain.Profile;
import com.aerossolutions.userservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository usr;


    public User createUser(String username, String email, String password){
        Profile profile = new Profile();
        User user = new User(username, email, password, profile);
        usr.save(user);
        return user;
    }

    public User getUser(UUID id) throws Exception {
        Optional<User> user = usr.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        throw new Exception();
    }


}
