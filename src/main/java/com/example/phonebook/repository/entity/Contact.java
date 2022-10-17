package com.example.phonebook.repository.entity;

import com.example.phonebook.controller.dto.ContactDto;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Contact {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "company")
    private String company;
    @Basic
    @Column(name = "job_function")
    private String function;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "telephone")
    private String telephone;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "adress_1")
    private String adress1;
    @Basic
    @Column(name = "adress_2")
    private String adress2;
    @Basic
    @Column(name = "postal_code")
    private Integer postalCode;
    @Basic
    @Column(name = "town")
    private String town;
    @OneToMany(mappedBy = "Contact1", cascade = CascadeType.PERSIST)
    private List<Relation> myRelationWithOthers;
    @OneToMany(mappedBy = "Contact2")
    private List<Relation> othersRelationWithMe;

    public Contact() {
    }

    public Contact(ContactDto contactDto){
        this.firstName = contactDto.getFirstName();
        this.lastName = contactDto.getLastName();
        this.company = contactDto.getCompany();
        this.function = contactDto.getFunction();
        this.email = contactDto.getEmail();
        this.telephone = contactDto.getTelephone();
        this.country = contactDto.getCountry();
        this.adress1 = contactDto.getAdress1();
        this.adress2 = contactDto.getAdress2();
        this.postalCode = contactDto.getPostalCode();
        this.town = contactDto.getTown();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAdress2() {
        return adress2;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Relation> getMyRelationsWithOthers() {
        return myRelationWithOthers;
    }

    public void setMyRelationsWithOthers(List<Relation> myRelationWithOthers) {
        this.myRelationWithOthers = myRelationWithOthers;
    }

    public List<Relation> getOthersRelationsWithMe() {
        return othersRelationWithMe;
    }

    public void setOthersRelationsWithMe(List<Relation> othersRelationWithMe) {
        this.othersRelationWithMe = othersRelationWithMe;
    }

}
