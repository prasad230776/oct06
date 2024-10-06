package com.example.studentmgmtsystem;

import java.util.List;

public interface ServiceInterface {
    public Student createStudent(Student student);
    public Student getStudent(Integer id);
    public List<Student> getAllStudents();
} 
