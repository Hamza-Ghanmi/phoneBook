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
    private String relation;
    @ManyToOne
    @JoinColumn(name = "id_contact_1", referencedColumnName = "id", nullable = false)
    private Contact Contact1;
    @ManyToOne
    @JoinColumn(name = "id_contact_2", referencedColumnName = "id", nullable = false)
    private Contact Contact2;

    public Relation() {
    }

    public Relation(String relation, Contact contact1, Contact contact2) {
        this.relation = relation;
        Contact1 = contact1;
        Contact2 = contact2;
    }

    public Object getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
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
