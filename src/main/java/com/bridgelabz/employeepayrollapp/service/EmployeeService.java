package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Mark this class as a Spring Service component
@Service
public class EmployeeService {
    // Create a list to store Employee objects
    private final List<Employee> employeeList = new ArrayList<>();

    // Adds a new employee to the employee list.
    public Employee addEmployee(Employee employee) {
        // Add the employee to the list
        employeeList.add(employee);
        return employee;
    }

    // Retrieves an employee by their unique ID.
    public Employee getEmployeeById(Long id) {
        // Find the employee with the given ID using stream API
        Optional<Employee> employee = employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();
        return employee.orElse(null);
    }

    // Retrieves all employees stored in the employee list.
    public List<Employee> getAllEmployees() {
        // Return the entire list of employees
        return employeeList;
    }

    // Updates an existing employee's details based on their ID.
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        // Loop through the list to find the employee by ID
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.set(i, updatedEmployee);
                return updatedEmployee;
            }
        }
        // Return null if no matching employee is found
        return null;
    }

    // Deletes an employee from the list based on their ID.
    public boolean deleteEmployee(Long id) {
        // Remove the employee from the list using removeIf()
        return employeeList.removeIf(emp -> emp.getId().equals(id));
    }
}
