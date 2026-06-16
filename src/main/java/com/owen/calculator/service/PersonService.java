package com.owen.calculator.service;

import com.owen.calculator.dao.PersonDao;
import com.owen.calculator.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;
    public Person getPersonDetails(){
        Person person = new Person();
        person.setId(1);
        person.setName("Owen");
        person.setAge(21);
        return person;
    }

    public List<Person> getAllPeople() {
        return personDao.findAll();
    }
}
