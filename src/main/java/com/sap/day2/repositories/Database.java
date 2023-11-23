package com.sap.day2.repositories;

import com.sap.day2.entity.Employee;
import lombok.Getter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@Slf4j
public class Database {

    private static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int employeeId) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId() == employeeId)
                .findFirst()
                .orElse(null);
    }

    public void addEmployee(Employee employee) {
        employee.setDateOfJoining();
        employees.add(employee);
    }

    public void editEmployee(int employeeId, Employee updatedEmployee) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(updatedEmployee.getName());
                employee.setRole(updatedEmployee.getRole());
                log.info("Employee with id {} updated", employeeId);
                found = true;
                break;
            }
        }
        if (!found) {
            log.warn("Employee with id {} not found", employeeId);
        }
    }

    public void deleteEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
    }
}
