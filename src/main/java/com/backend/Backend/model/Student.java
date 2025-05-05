package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student extends Person {
    private String academicDegree;

    @OneToMany(mappedBy = "student")
    private List<FoodOrder> orders;
}

