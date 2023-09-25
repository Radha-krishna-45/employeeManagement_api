package org.employeemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id // primary key
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    // it tells JPA that the database will automatically assign a unique identifier (usually an incrementing number) to the entity when it's inserted into the database
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String department;
    private int salary;
}
