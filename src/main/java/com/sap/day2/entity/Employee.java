package com.sap.day2.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Employee {

    private String name;
    private int employeeId;
    private String role;
    private int dateOfJoining;

    public Employee(String name, int employeeId, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }

    public void setDateOfJoining() {
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }
}
