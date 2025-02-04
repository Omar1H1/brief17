package com.example.brief17.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.brief17.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}