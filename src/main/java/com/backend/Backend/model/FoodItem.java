package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class FoodItem {
    @Id
    private String id;
    private String name;
    private double price;
    private double weight;

    @ManyToMany(mappedBy = "foodItems")
    private List<DailyMenu> menus;

    @OneToMany(mappedBy = "foodItem")
    private List<OrderLine> orderLines;
}

