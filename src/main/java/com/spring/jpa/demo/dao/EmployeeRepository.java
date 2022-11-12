package com.spring.jpa.demo.dao;

import com.spring.jpa.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Basic interface DAO that takes all methods from JpaRepository class
 * In Generics set "@Table" class and type Primary Key
 * <p>
 * The spring-boot-starter-data-rest replace Controller and Service.
 * Now URL without /api/employees -> /employees
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
