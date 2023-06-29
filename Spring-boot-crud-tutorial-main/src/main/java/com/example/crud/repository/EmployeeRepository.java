package com.example.crud.repository;
//Hibernate jpa file, here connecting Entity class to service implementation class
//EmployeeRepository.java
import com.example.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
