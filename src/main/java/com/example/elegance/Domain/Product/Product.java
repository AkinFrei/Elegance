package com.example.elegance.Domain.Product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="product")
@RequiredArgsConstructor
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "amount")
    private int amount;

    @ManyToOne
    @JoinColumn(name="order_id", nullable = false)
    private Orders order;

    @Column(name = "price")
    private float price;

}

