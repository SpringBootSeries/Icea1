package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Canteen {
    @Id
    private String id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "canteen")
    private List<DailyMenu> dailyMenus;

    @ManyToMany(mappedBy = "canteens")
    private List<Employee> employees;
}

