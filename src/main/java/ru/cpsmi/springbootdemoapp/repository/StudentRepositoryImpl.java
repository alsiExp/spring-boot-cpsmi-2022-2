package ru.cpsmi.springbootdemoapp.repository;

import org.springframework.stereotype.Repository;
import ru.cpsmi.springbootdemoapp.model.Student;

import java.util.ArrayList;
import java.util.List;
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
    public List<Student> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Student save(String name) {
        Student student = new Student(counter.incrementAndGet(), name);
        map.put(student.getId(), student);
        return student;
    }
}
