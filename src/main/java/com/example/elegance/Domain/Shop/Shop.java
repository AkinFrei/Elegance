package com.example.elegance.Domain.Shop;

import jakarta.persistence.*;
import lombok.*;
import lombok.RequiredArgsConstructor;
import com.example.elegance.Domain.Owner.Owner;


import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="shop")
@RequiredArgsConstructor
public class Shop {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "shops")
    private Set<Owner> owners = new HashSet<>();


}