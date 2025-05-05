package com.backend.Backend.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class FoodOrder {
    @Id
    private String id;
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderLine> orderLines;
}

