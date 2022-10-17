package com.example.phonebook.repository;

import com.example.phonebook.repository.entity.Relation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepository extends CrudRepository<Relation,Long> {
}