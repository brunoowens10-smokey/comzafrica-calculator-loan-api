package com.owen.calculator.controller;

import com.owen.calculator.model.Person;
import com.owen.calculator.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public Person getPersonDetails(){
        return personService.getPersonDetails();
    }


    @GetMapping("/all")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}
