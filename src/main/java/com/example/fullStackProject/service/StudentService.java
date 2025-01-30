package com.example.fullStackProject.service;

import com.example.fullStackProject.Dto.Student;
import com.example.fullStackProject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student setStudent(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).get();
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
