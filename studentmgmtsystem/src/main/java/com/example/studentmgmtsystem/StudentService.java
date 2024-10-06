package com.example.studentmgmtsystem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements ServiceInterface{

    StudentRepo repo;
    StudentService(StudentRepo repo){
        this.repo = repo;
    }
    @Override
    public Student createStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student getStudent(Integer id) {
       return repo.findById(id).get();  //Optional data type
    }

    @Override
    public List<Student> getAllStudents() {
       return repo.findAll();
    }
    
}
