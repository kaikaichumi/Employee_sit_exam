package com.example.demo.web;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeContorller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/employee")
    public Iterable<Employee> get() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable Integer id) {
        Employee employee = employeeService.getById(id);
        if (employee == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.remove(id);
    }

    @PostMapping("/employee")
    public Employee create(@RequestPart("id") String id, @RequestPart("name") String name, @RequestPart("mail") String mail) {
        return employeeService.save(id, name, mail);
    }
}
