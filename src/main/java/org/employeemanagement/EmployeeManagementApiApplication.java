package org.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApiApplication.class, args);
        System.out.println("Spring boot app is running");
    }
}
