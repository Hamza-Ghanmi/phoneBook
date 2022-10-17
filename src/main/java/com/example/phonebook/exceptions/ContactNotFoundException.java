package com.example.phonebook.exceptions;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(Long id) {
        super("Contact with id " + id + " does not exist");
    }
}
