package org.employeemanagement.services;

import org.employeemanagement.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeServiceInterface {
    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Optional<Employee> getEmployeeById(int id);

    public void deleteEmployee(int id);

    public void updateEmployee(int id, Employee employee);


}
