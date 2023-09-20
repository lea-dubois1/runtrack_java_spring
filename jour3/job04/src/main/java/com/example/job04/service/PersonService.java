package com.example.job04.service;

import com.example.job04.model.Person;
import com.example.job04.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
