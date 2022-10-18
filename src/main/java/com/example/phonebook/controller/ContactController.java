package com.example.phonebook.controller;

import com.example.phonebook.controller.dto.ContactDto;
import com.example.phonebook.service.ContactService;
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
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/all-contacts")
    public ModelAndView showAllContacts(){
        ModelAndView modelAndView = new ModelAndView("contactList");
        List<ContactDto> contactDtos = contactService.getAllcontacts();
        modelAndView.addObject("contactDtos", contactDtos);
        return modelAndView;
    }

    @GetMapping("/details/{id}")
    public ModelAndView showDetails(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("contactDetails");
        ContactDto contactDto = contactService.findContactById(id);
        modelAndView.addObject("contactDto", contactDto);
        return modelAndView;
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

    @GetMapping("/edit-contact/{id}")
    public ModelAndView displayEditContactForm(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("editContactForm");
        ContactDto contactDto = contactService.findContactById(id);
        modelAndView.addObject("contactDto", contactDto);
        Map<Long, String> contacts = new HashMap<>();
        List<ContactDto> contactDtos = contactService.getAllcontacts();
        contactDtos.forEach(contact -> {
            contacts.put(contact.getId(), contact.getFirstName() + " " + contact.getLastName());
        });
        modelAndView.addObject("contacts", contacts);
        return modelAndView;
    }

    @PostMapping("/edit-contact")
    public String editContact(ContactDto contactDto){
        contactService.editContact(contactDto);
        return "redirect:/contacts/all-contacts";
    }

}
