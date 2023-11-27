package com.sap.day2.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
public class Employee {

    private String name;
    private int employeeId;
    private String role;
    private int dateOfJoining;

    //Constructor based DI
    @Autowired
    public Employee() {
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }

    public Employee(String name, int employeeId, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }

    //Setter based DI
    @Autowired
    public void setDateOfJoining() {
        this.dateOfJoining = (int) LocalDate.now().toEpochDay();
    }
}
