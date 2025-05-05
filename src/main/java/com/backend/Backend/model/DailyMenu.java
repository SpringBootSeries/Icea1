package com.backend.Backend.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class DailyMenu {
    @Id
    private String id;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "canteen_id")
    private Canteen canteen;

    @ManyToMany
    @JoinTable(name = "menu_food_items",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "food_item_id"))
    private List<FoodItem> foodItems;
}
