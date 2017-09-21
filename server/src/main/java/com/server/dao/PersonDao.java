package com.server.dao;

import com.server.domain.Person;
import java.util.List;

public interface PersonDao {

    void add(Person person);

    List<Person> listPersons();
}
