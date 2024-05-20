package com.example.elegance.Domain.Order;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Orders, UUID>{

}
