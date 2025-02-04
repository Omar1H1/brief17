package com.example.brief17;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.brief17.entity.Student;
import com.example.brief17.service.StudentService;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
class StudentServiceIntegrationTest {

    @Autowired
    private StudentService studentService;

    @Test
    void shouldSaveAndRetrieveStudent() {

        Student student = Student.builder()
                .name("Jean")
                .address("7 rue Jean")
                .build();

        Student savedStudent = studentService.saveStudent(student);

        Student maybeStudent = studentService.findStudentById(savedStudent.getId()).orElseThrow();

        assertEquals(savedStudent, maybeStudent);
    }
}