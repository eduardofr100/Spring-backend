package com.example.springbackend.employees;

public class EmployeeNotFoundException extends RuntimeException  {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
