package com.example.phonebook.controller;

import com.example.phonebook.controller.dto.ContactDto;
import com.example.phonebook.controller.dto.UserDto;
import com.example.phonebook.service.ContactService;
import com.example.phonebook.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sign-in")
    public ModelAndView displayInscriptionForm(){
        ModelAndView modelAndView = new ModelAndView("inscriptionForm");
        modelAndView.addObject("userDto", new UserDto());
        return modelAndView;
    }

    @PostMapping("/sign-in")
    public  String addUser(UserDto userDto){
        userService.addContact(userDto);
        return "redirect:/contacts/all-contacts";
    }

}
