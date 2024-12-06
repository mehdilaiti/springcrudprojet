package com.example.springdata.controller;

import com.example.springdata.model.Employee;
import com.example.springdata.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpController {

   @Autowired
    private EmpService empService ;
    @GetMapping("/lol")
    public Employee getUser(@RequestParam Integer id){

        return empService.getUser(id);
    }
}
