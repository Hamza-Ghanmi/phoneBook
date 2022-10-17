package com.example.phonebook.controller.dto;

import com.example.phonebook.repository.entity.Contact;


public class ContactDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String company;
    private String function;
    private String email;
    private String telephone;
    private String country;
    private String adress1;
    private String adress2;
    private Integer postalCode;
    private String town;

    private String relation;

    private Long contact2Id;

    public ContactDto() {
    }

    public ContactDto(Contact contact){
        this.id = contact.getId();
        this.firstName = contact.getFirstName();
        this.lastName = contact.getLastName();
        this.company = contact.getCompany();
        this.function = contact.getFunction();
        this.email = contact.getEmail();
        this.telephone = contact.getTelephone();
        this.country = contact.getCountry();
        this.adress1 = contact.getAdress1();
        this.adress2 = contact.getAdress2();
        this.postalCode = contact.getPostalCode();
        this.town = contact.getTown();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getFunction() {
        return function;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCountry() {
        return country;
    }

    public String getAdress1() {
        return adress1;
    }

    public String getAdress2() {
        return adress2;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Long getContact2Id() {
        return contact2Id;
    }

    public void setContact2Id(Long contact2Id) {
        this.contact2Id = contact2Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}