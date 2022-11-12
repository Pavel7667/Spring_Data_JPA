package com.spring.jpa.demo.dao;

import com.spring.jpa.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Basic interface DAO that takes all methods from JpaRepository class
 * In Generics set "@Table" class and type Primary Key
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
