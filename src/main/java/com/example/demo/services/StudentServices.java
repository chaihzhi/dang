package com.example.demo.services;


import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAll(){
        return studentMapper.getAll();
    }

    public Student getOne(Long id){
        return studentMapper.getOne(id);
    }

    public void insert(Student student){
        studentMapper.insert(student);
    }
    public void update(Student student){
        studentMapper.update(student);
    }
    public void delete(Long id){
        studentMapper.delete(id);
    }


}
