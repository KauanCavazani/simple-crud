package com.example.spring.crud.service;

import com.example.spring.crud.entity.Student;
import com.example.spring.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "student removed!";
    }

    public String updateStudent(int id, Student student) {
        Student existingStudent = repository.findById(id).orElse(null);

        if(existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setCourse(student.getCourse());
            repository.save(existingStudent);
            return "updated student";
        } else {
            return "student do not exist";
        }

    }

}
