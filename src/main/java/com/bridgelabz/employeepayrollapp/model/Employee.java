package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

// Represents the Employee entity mapped to the database table.
@Data
@Entity
@Table(name = "employees")
public class Employee {
    // Primary key for Employee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Employee name
    private String name;

    // Employee salary
    private double salary;

    // Employee gender
    private String gender;

    // Employee note
    private String note;

    // Employee start date stored in the database
    @Column(name = "start_date")
    private LocalDate startDate;

    // Employee profile picture URL
    private String profilePic;

    // List of departments the employee belongs to
    @ElementCollection
    private List<String> department;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor to initialize the employee object
    public Employee(String name, double salary, String gender, String note, LocalDate startDate, String profilePic, List<String> department) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.note = note;
        this.startDate = startDate;
        this.profilePic = profilePic;
        this.department = department;
    }
}
