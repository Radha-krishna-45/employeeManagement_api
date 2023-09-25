package org.employeemanagement.services;

import org.employeemanagement.model.Employee;
import org.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void updateEmployee(int id, Employee employee) {

    }
}
