package com.example.conferenceusingjpa.service;

import com.example.conferenceusingjpa.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User save(User user);
}
