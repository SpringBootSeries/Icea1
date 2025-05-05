package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
    @Id
    private String id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private FoodOrder order;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;
}

