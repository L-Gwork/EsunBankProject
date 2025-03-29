package com.example.EsunBankProject.service;

import com.example.EsunBankProject.Employee;
import com.example.EsunBankProject.SeatingChart;
import com.example.EsunBankProject.repository.EmployeeRepository;
import com.example.EsunBankProject.repository.SeatingChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SeatingChartRepository seatingChartRepository;

    @Transactional // 使用事務，確保操作原子性
    public void createEmployeeAndSeating(Employee employee, SeatingChart seatingChart) {
        // 插入或更新 Employee
        employeeRepository.save(employee);

        // 插入或更新 SeatingChart
        seatingChartRepository.save(seatingChart);
    }
}
