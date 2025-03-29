package com.example.EsunBankProject.repository;

import com.example.EsunBankProject.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}