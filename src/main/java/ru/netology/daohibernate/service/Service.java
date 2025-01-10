package ru.netology.daohibernate.service;


import ru.netology.daohibernate.entity.Person;
import ru.netology.daohibernate.repository.Repository;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getAge(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getNameSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}