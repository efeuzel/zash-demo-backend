package com.example.zashbackend.web;

import com.example.zashbackend.domain.User;
import com.example.zashbackend.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class userController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public ResponseEntity<?> createOrUpdateUser(@RequestBody User user) {
        User newUser  = userRepository.save(user);
        return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
    }

    //for testing only
    @GetMapping("/all")
    public Iterable<User> getAllUsers() {return userRepository.findAll();};

}
