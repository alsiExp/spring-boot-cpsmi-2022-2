package ru.cpsmi.springbootdemoapp.repository;

import ru.cpsmi.springbootdemoapp.model.Student;

import java.util.List;

public interface StudentRepository {

    Student findById(Long id);

    List<Student> findAll();

    Student save(String name);

}
