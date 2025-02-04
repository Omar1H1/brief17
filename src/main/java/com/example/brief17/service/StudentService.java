package com.example.brief17.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.brief17.entity.Student;
import com.example.brief17.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}