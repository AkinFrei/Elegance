package com.example.elegance.Domain.Customer;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="customer")
@RequiredArgsConstructor
public class Customer {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "is_registered")
    private boolean isRegistered;

}
