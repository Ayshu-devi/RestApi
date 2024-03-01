package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Person;
import com.example.q1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired 
    PersonRepo obj;
    public Person postPerson(Person person)
    {
        return obj.save(person);
    }
    public List<Person> getByNameStartingWith(String a)
    {
        return obj.findByNameStartingWith(a);
    }
    public List<Person> getByNameEndingWith(String a)
    {
        return obj.findByNameEndingWith(a);
    }
}
