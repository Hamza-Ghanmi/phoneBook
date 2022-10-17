package com.example.phonebook.repository.entity;

import javax.persistence.*;

@Entity
public class Relation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "relation")
    private Object relation;
    @ManyToOne
    @JoinColumn(name = "id_contact_1", referencedColumnName = "id", nullable = false)
    private Contact Contact1;
    @ManyToOne
    @JoinColumn(name = "id_contact_2", referencedColumnName = "id", nullable = false)
    private Contact Contact2;

    public Object getRelation() {
        return relation;
    }

    public void setRelation(Object relation) {
        this.relation = relation;
    }

    public Contact getContact1() {
        return Contact1;
    }

    public void setContact1(Contact contact1) {
        Contact1 = contact1;
    }

    public Contact getContact2() {
        return Contact2;
    }

    public void setContact2(Contact contact2) {
        Contact2 = contact2;
    }
}
