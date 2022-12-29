package com.Crud.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Crud.Application.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
