package com.Spring.RESTful.APIs.CodingShuttleCourse.dto;

import java.time.LocalDate;

public class EmployeeDTO {

    private long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateofJoining;
    private boolean isActive;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateofJoining() {
        return dateofJoining;
    }

    public void setDateofJoining(LocalDate dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Parameterised Constructor
    public EmployeeDTO(int age, LocalDate dateofJoining, String email, long id, boolean isActive, String name) {
        this.age = age;
        this.dateofJoining = dateofJoining;
        this.email = email;
        this.id = id;
        this.isActive = isActive;
        this.name = name;
    }
    // Dafault Constructor
    public EmployeeDTO(){

    }
}
