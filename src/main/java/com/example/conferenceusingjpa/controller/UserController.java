package com.example.conferenceusingjpa.controller;

import com.example.conferenceusingjpa.model.User;
import com.example.conferenceusingjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //the local host URL will be like this unlike the course: http://localhost:8080/user?firstName=Mustafa&lastName=Taha&age=21
    @GetMapping("/create/user")
    public User getUser(@RequestParam(value = "Mustafa", defaultValue = "Sasa") String firstName,
                         @RequestParam(value = "Taha", defaultValue = "Elmasasa") String lastName,
                         @RequestParam(value = "21", defaultValue = "33") int age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;

    }


    @PostMapping("/save/user")
    public User saveUser(User user){
        System.out.println("User's First Name: " + user.getFirstName());

        userService.save(user);

        return user; //idk why we return anything in a post request
    }
}
