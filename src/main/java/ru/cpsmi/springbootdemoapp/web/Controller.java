package ru.cpsmi.springbootdemoapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.cpsmi.springbootdemoapp.model.Student;
import ru.cpsmi.springbootdemoapp.repository.StudentRepository;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    @Qualifier("studentRepositoryImpl")
    private StudentRepository repository;

    @GetMapping("/test")
    public String getTestGreeting() {
        return "Hello";
    }

    @GetMapping("/save/{name}")
    public Student save(@PathVariable String name) {
        return repository.save(name);
    }

    @GetMapping("/students/{id}")
    public Student find(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return repository.findAll();
    }

}
