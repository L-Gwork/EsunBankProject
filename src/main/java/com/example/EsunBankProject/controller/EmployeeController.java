package com.example.EsunBankProject.controller;

import com.example.EsunBankProject.Employee;
import com.example.EsunBankProject.SeatingChart;
import com.example.EsunBankProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployeeAndSeating(@RequestBody Employee employee, @RequestBody SeatingChart seatingChart) {
        employeeService.createEmployeeAndSeating(employee, seatingChart);
    }
}