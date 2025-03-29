package com.example.EsunBankProject;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id

    private String empId;
    private String name;
    private String email;
    private String floorSeatSeq;
}
