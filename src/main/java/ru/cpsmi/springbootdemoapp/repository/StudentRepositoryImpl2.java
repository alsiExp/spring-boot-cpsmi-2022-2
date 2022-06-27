package ru.cpsmi.springbootdemoapp.repository;

import org.springframework.stereotype.Repository;
import ru.cpsmi.springbootdemoapp.model.Student;

@Repository
public class StudentRepositoryImpl2 implements StudentRepository {

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public Student save(String name) {
        return null;
    }
}
