package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeRequestDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service class to handle Employee business logic.
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Saves a new employee to the database.
    public Employee addEmployee(@Valid EmployeeRequestDTO employeeData) {
        Employee employee = new Employee(employeeData.getName(), employeeData.getSalary(), employeeData.getGender(), employeeData.getNote(), employeeData.getStartDate(), employeeData.getProfilePic(), employeeData.getDepartment());

        return employeeRepository.save(employee);
    }

    // Retrieves all employees from the database.
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
