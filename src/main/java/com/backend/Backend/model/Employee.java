package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Employee extends Person {
    private String jobPosition;

    @ManyToMany
    @JoinTable(name = "employee_canteens",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "canteen_id"))
    private List<Canteen> canteens;
}
