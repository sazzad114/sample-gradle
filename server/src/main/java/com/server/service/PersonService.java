package com.server.service;

import com.server.domain.Person;

import java.util.List;


public interface PersonService {

    void add(Person person);

    List<Person> listPersons();
}
