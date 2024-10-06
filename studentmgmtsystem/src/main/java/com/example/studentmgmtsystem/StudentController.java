package com.example.studentmgmtsystem;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    ServiceInterface serviceInterface;
    StudentController(ServiceInterface serviceInterface){
        this.serviceInterface = serviceInterface;
    }

    @PostMapping("/api/students")
    public Student addStudent(@RequestBody Student student){
       return serviceInterface.createStudent(student);
    }

    @GetMapping("/api/students/{id}")
    public Student getStudent(@PathVariable Integer id){
        return serviceInterface.getStudent(id);
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents(){
        return serviceInterface.getAllStudents();
    }
}
