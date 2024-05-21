package com.example.elegance.Domain.Product;

import java.util.UUID;

import com.example.elegance.Domain.Order.Orders;

import lombok.*;

@Data
@Getter
@Setter
public class ProductDTO {

    private UUID id;

    private String name;

    private String category;

    private String subCategory;

    private int amount;


    private Orders order;

    private float price;

}
