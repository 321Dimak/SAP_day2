package com.sap.day2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Employee2 {

    private String name;
    private int employeeId;
    private String role;
    private int dateOfJoining;

    @Autowired
    public Employee2(String name, int employeeId, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }
}
