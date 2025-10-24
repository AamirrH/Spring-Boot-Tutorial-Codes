package com.Spring.RESTful.APIs.CodingShuttleCourse.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id// Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) // Basically db will look at previous id and autoincrement the next id by 1
    private long id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_email")
    private String email;
    @Column(name = "employee_age")
    private int age;
    @Column(name = "employee_dateOfJoining")
    private LocalDate dateofJoining;
    @Column(name = "employee_isActive")
    private boolean isActive;




}
