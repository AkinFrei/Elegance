package com.example.elegance.Domain.Owner;

import jakarta.persistence.*;
import lombok.*;
import lombok.RequiredArgsConstructor;
import com.example.elegance.Domain.Shop.Shop;



import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="owner")
@RequiredArgsConstructor
public class Owner {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @ManyToMany
    @JoinTable(
            name = "shop_owner",
            joinColumns = {@JoinColumn(name = "owner_id")},
            inverseJoinColumns = {@JoinColumn(name = "shop_id")}
    )
    private Set<Shop> shops =new HashSet<>();
}
