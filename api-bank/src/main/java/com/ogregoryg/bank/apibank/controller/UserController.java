package com.ogregoryg.bank.apibank.controller;

import com.ogregoryg.bank.apibank.entity.User;
import com.ogregoryg.bank.apibank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getUser(){
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(code=HttpStatus.CREATED)
    public User save(@Valid @RequestBody User user) {
//        users.add(user);
        return userService.save(user);

    }
}

