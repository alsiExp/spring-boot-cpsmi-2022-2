package ru.cpsmi.springbootdemoapp.repository;

import ru.cpsmi.springbootdemoapp.model.Student;

public interface StudentRepository {

    Student findById(Long id);

    Student save(String name);

}
