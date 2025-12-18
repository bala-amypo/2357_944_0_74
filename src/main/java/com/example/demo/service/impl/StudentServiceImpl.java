package com.example.demo.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

    private Map<Long, Student> mp = new HashMap<>();

    @Override
    public Student insertStudent(Student st) {
        mp.put(st.getId(), st);
        return st;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(mp.values());
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return Optional.ofNullable(mp.get(id));
    }

    @Override
    public void deleteStudent(Long id) {
        mp.remove(id);
    }
}
