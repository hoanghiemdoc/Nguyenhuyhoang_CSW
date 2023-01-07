package com.example.nguyenhuyhoang.repository;

import com.example.nguyenhuyhoang.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}