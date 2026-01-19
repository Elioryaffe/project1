package com.example.Project1.repo;


import com.example.Project1.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
    public Student findByFullName(String fullName);
}