package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee save(String id, String name, String mail) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmployeeName(name);
        employee.setEmployeeMail(mail);
        employeeRepository.save(employee);
        return employee;
    }
}
