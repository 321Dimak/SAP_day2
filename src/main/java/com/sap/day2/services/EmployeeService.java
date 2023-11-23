package com.sap.day2.services;

import com.sap.day2.entity.Employee;
import com.sap.day2.repositories.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Database database;

    public List<Employee> getAllEmployees() {
        return database.getAllEmployees();
    }

    public Employee getEmployeeById(int employeeId) {
        return database.getEmployeeById(employeeId);
    }

    public void addEmployee(Employee employee) {
        database.addEmployee(employee);
    }

    public void editEmployee(int employeeId, Employee updatedEmployee) {
        database.editEmployee(employeeId, updatedEmployee);
    }

    public void deleteEmployee(int employeeId) {
        database.deleteEmployee(employeeId);
    }
}
