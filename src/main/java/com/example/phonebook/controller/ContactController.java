package com.example.phonebook.controller;

import com.example.phonebook.controller.dto.ContactDto;
import com.example.phonebook.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/add-contact")
    public ModelAndView displayAddContactForm(){
        ModelAndView modelAndView = new ModelAndView("addContactForm");
        modelAndView.addObject("contactDto", new ContactDto());
        Map<Long, String> contacts = new HashMap<>();
        List<ContactDto> contactDtos = contactService.getAllcontacts();
        contactDtos.forEach(contactDto -> {
            contacts.put(contactDto.getId(), contactDto.getFirstName() + " " + contactDto.getLastName());
        });
        modelAndView.addObject("contacts", contacts);
        return modelAndView;
    }

    @PostMapping("/add-contact")
    public String addContact(ContactDto contactDto){
        contactService.addContact(contactDto);
        return "addContactForm";
    }

}
