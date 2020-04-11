package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class IndexController {

    @RequestMapping("/index")
    public Map<String,String> index(){
        Map map = new HashMap<String,String>();
        map.put("1","a");
        map.put("2","b");
        return map;
    }
}
