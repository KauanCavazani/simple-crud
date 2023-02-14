package com.example.spring.crud.controller;

import com.example.spring.crud.entity.Student;
import com.example.spring.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/get-all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/get-by-id/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public String deleteStudentById(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    @DeleteMapping("/delete-all")
    public String deleteAllStudents() {
        return service.deleteAllStudents();
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

}
