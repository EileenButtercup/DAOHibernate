package ru.netology.daohibernate.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.daohibernate.entity.Person;
import ru.netology.daohibernate.service.Service;

import java.util.List;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
