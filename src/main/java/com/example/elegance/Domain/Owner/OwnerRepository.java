package com.example.elegance.Domain.Owner;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository <Owner, UUID>{

}
