package ru.cpsmi.springbootdemoapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.cpsmi.springbootdemoapp.model.Student;
import ru.cpsmi.springbootdemoapp.repository.StudentRepository;

@RestController
public class Controller {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/test")
    public String getTestGreeting() {
        return "Hello";
    }

    @GetMapping("/save/{name}")
    public Student save(@PathVariable String name) {
        return repository.save(name);
    }

    @GetMapping("/{id}")
    public Student find(@PathVariable Long id) {
        return repository.findById(id);
    }

}
