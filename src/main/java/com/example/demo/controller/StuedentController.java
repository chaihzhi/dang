package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuedentController {

    @Autowired
    private StudentServices studentServices;
    @RequestMapping("/getAll")
    public List<Student> getAll(){
        return studentServices.getAll();
    }
}
