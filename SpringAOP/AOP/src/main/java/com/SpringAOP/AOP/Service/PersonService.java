package com.SpringAOP.AOP.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAOP.AOP.Repository.PersonRepository;

import lombok.val;

import com.SpringAOP.AOP.Model.Person;

@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Person getPerson(int id){
        return personRepository.findById(id).orElse(null);
    }

    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    public void updatePerson(Person person){
        personRepository.save(person);
    }

    public void deletePerson(int id){
        personRepository.deleteById(id);
    }


}
