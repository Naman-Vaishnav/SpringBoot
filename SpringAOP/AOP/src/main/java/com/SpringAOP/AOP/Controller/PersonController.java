package com.SpringAOP.AOP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.SpringAOP.AOP.Model.Person;
import com.SpringAOP.AOP.Service.PersonService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    PersonService personService;

    @GetMapping("")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("{id}")
    public Person getPerson(@PathVariable int id){
        return personService.getPerson(id);
    }

    @PostMapping("")
        public Person addPersson(@RequestBody Person person){
            return personService.addPerson(person);
            
        }
    

    @PutMapping("")
        public String updatePerson(@RequestBody Person person){
            personService.updatePerson(person);
            return "Success";
        }

    @DeleteMapping("{id}")
        public void deleteProduct(@PathVariable int id){
            personService.deletePerson(id);
        }


    

}
