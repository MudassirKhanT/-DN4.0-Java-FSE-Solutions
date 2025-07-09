package com.company.employeemanagement.controller;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repo;

    @GetMapping
    public List<Employee> getAll() { return repo.findAll(); }

    @GetMapping("/paged")
    public Page<Employee> getPaged(Pageable pageable) { return repo.findAll(pageable); }

    @GetMapping("/summary")
    public List<?> getSummaries() { return repo.findEmployeeSummaries(); }

    @PostMapping
    public Employee add(@RequestBody Employee employee) { return repo.save(employee); }
}

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private com.company.employeemanagement.repository.DepartmentRepository repo;

    @GetMapping
    public List<com.company.employeemanagement.entity.Department> getAll() { return repo.findAll(); }

    @PostMapping
    public com.company.employeemanagement.entity.Department add(@RequestBody com.company.employeemanagement.entity.Department dept) {
        return repo.save(dept);
    }
}
