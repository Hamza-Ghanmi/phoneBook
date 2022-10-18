package com.example.phonebook.service;

import com.example.phonebook.controller.dto.ContactDto;
import com.example.phonebook.exceptions.ContactNotFoundException;
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

    public ContactDto findContactById(Long id) throws ContactNotFoundException {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new ContactNotFoundException(id));
        ContactDto contactDto = new ContactDto(contact);
        return contactDto;
    }

    public void editContact(ContactDto contactDto) {
        Long id = contactDto.getId();
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new ContactNotFoundException(id));
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setCompany(contactDto.getCompany());
        contact.setFunction(contactDto.getFunction());
        contact.setEmail(contactDto.getEmail());
        contact.setTelephone(contactDto.getTelephone());
        contact.setCountry(contactDto.getCountry());
        contact.setAdress1(contactDto.getAdress1());
        contact.setAdress2(contactDto.getAdress2());
        contact.setPostalCode(contactDto.getPostalCode());
        contact.setTown(contactDto.getTown());
        contactRepository.save(contact);
    }
}
