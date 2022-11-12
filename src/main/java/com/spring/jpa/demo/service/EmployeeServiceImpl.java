package com.spring.jpa.demo.service;


import com.spring.jpa.demo.dao.EmployeeRepository;
import com.spring.jpa.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // also EmployeeRepository(extend JpaRepository) guarantee Transaction
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * getAllEmployees use link to DAO-Object to get Objects from DB
     *
     * @return employeeRepository = List of Objects from DB
     */
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * saveEmployee use link DAO-Object for Service-Object to save Objects in DB
     */
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    /**
     * Method getEmployee using DAO-Realization of getting Object fom DB
     * Checking is there Object with this ID
     *
     * @param id of object in DB
     * @return object from DB
     */
    @Override
    public Employee getEmployee(int id) {
        Employee employeeSet = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employeeSet = optional.get();
        }
        return employeeSet;
    }

    /**
     * Method deleteEmployee using DAO-Realization of deleting Object fom DB
     *
     * @param id of object in DB
     */
    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    /**
     * Using JpaRepository realization popular SQL queries
     *
     * @param name from request
     * @return List objects/JSON with same Names
     */
    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
