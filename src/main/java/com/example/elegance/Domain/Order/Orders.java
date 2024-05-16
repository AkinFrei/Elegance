package com.example.elegance.Domain.Order;

import jakarta.persistence.*;
import lombok.*;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="orders")
@RequiredArgsConstructor
public class Orders {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @OneToMany(mappedBy = "order")
    private List<Product> product;
}