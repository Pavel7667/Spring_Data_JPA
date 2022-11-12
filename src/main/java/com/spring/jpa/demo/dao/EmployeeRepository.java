package com.spring.jpa.demo.dao;

import com.spring.jpa.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Basic interface DAO that takes all methods from JpaRepository class
 * In Generics set "@Table" class and type Primary Key
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * Using JpaRepository realization popular SQL queries
     *
     * @param name field from Table/request
     * @return Objects with same Names
     */
    public List<Employee> findAllByName(String name);
}
