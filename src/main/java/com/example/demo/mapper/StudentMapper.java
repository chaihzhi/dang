package com.example.demo.mapper;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student>{

    List<Student> getAll();
    Student getOne(Long id);
    void insert(Student user);
    void update(Student user);
    void delete(Long id);
}
