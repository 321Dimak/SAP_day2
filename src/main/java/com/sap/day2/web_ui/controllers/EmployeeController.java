package com.sap.day2.web_ui.controllers;

import com.sap.day2.entity.Employee;
import com.sap.day2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>>  getAllEmployee() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/employee/find")
    public ResponseEntity<Employee> findEmployeeById(@RequestParam int findEmployeeId) {
        Employee employee = employeeService.getEmployeeById(findEmployeeId);

        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/employee/add")
    public String addEmployee(@ModelAttribute Employee employee, Model model) {
        employeeService.addEmployee(employee);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "redirect:/";
    }

    @PostMapping("/employee/edit")
    public String editEmployeeById(@RequestParam int editEmployeeId, @ModelAttribute Employee updatedEmployee, Model model) {
        employeeService.editEmployee(editEmployeeId, updatedEmployee);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "redirect:/";
    }

    @PostMapping("/employee/delete")
    public String deleteEmployeeById(@RequestParam int deleteEmployeeId, Model model) {
        employeeService.deleteEmployee(deleteEmployeeId);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "redirect:/";
    }

}
