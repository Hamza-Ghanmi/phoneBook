package com.example.phonebook.service;

import com.example.phonebook.controller.dto.UserDto;
import com.example.phonebook.repository.UserRepository;
import com.example.phonebook.repository.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addContact(UserDto userDto) {
        User user = new User(userDto);
        userRepository.save(user);
    }
}
