package com.example.crud.service;
//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteDepartmentById(Long id);
}
