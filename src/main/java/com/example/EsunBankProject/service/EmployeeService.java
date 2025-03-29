package com.example.EsunBankProject.service;

import com.example.EsunBankProject.Employee;
import com.example.EsunBankProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void createEmployee(Employee employee) {
        // 插入或更新 Employee
        employeeRepository.save(employee);
    }
}
