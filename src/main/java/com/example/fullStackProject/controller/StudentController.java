package com.example.fullStackProject.controller;

import com.example.fullStackProject.Dto.Student;
import com.example.fullStackProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String greet(){
        return "Hello Sathvik";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @PostMapping("/students")
    public Student setStudent(@RequestBody Student student){
        System.out.println(student);
        return service.setStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
    }
}