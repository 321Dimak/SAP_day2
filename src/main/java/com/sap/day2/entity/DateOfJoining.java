package com.sap.day2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class DateOfJoining {

    private int date = (int) LocalDate.now().toEpochDay();
}
