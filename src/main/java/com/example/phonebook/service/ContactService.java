package com.example.phonebook.service;

import com.example.phonebook.controller.dto.ContactDto;
import com.example.phonebook.repository.ContactRepository;
import com.example.phonebook.repository.RelationRepository;
import com.example.phonebook.repository.entity.Contact;
import com.example.phonebook.repository.entity.Relation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    private RelationRepository relationRepository;
    public ContactService(ContactRepository contactRepository, RelationRepository relationRepository) {
        this.contactRepository = contactRepository;
        this.relationRepository = relationRepository;
    }

    public boolean addContact(ContactDto contactDto){
        Contact contact = new Contact(contactDto);
        Optional<Contact> contact2 = contactRepository.findById(contactDto.getContact2Id());
        if (contact2.isPresent()){
            Relation relation = new Relation(contactDto.getRelation(), contact, contact2.get());
            contact.setMyRelationsWithOthers(new ArrayList<>());
            contact.getMyRelationsWithOthers().add(relation);
        }
        contactRepository.save(contact);
        return true;
    }

    public List<ContactDto> getAllcontacts() {
        List<ContactDto> contactDtos = new ArrayList<>();
        contactRepository.findAll().forEach(contact -> {
            ContactDto contactDto = new ContactDto(contact);
            contactDtos.add(contactDto);
        });
        return contactDtos;
    }
}
