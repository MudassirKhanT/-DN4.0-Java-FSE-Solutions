package com.company.employeemanagement.repository;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.projection.EmployeeSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByNameContaining(String name);

    @Query("select e from Employee e where e.department.name = :deptName")
    List<Employee> findByDepartmentName(String deptName);

    @Query("select e.name as name, e.email as email from Employee e")
    List<EmployeeSummary> findEmployeeSummaries();

    Page<Employee> findAll(Pageable pageable);
}

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
