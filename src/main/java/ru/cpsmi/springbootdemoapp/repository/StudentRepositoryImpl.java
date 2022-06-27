package ru.cpsmi.springbootdemoapp.repository;

import org.springframework.stereotype.Repository;
import ru.cpsmi.springbootdemoapp.model.Student;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private ConcurrentHashMap<Long, Student> map = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong();

    @Override
    public Student findById(Long id) {
        return map.get(id);
    }

    @Override
    public Student save(String name) {
        Student student = new Student(counter.incrementAndGet(), name);
//        return map.put(student.getId(), student);
        map.put(student.getId(), student);
        return student;
    }
}
