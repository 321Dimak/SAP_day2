package com.sap.day2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Employee1 {

    private String name;
    private int employeeId;
    private String role;
    private int dateOfJoining;

    @Autowired
    public void setDateOfJoining() {
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Autowired
    public void setRole(String role) {
        this.role = role;
    }
}
