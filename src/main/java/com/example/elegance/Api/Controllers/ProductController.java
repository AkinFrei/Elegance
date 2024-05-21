package com.example.elegance.Api.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.elegance.Api.Services.ProductService;
import com.example.elegance.Domain.Product.Product;
import com.example.elegance.Domain.Product.ProductDTO;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDto) {
        return productService.saveProduct(productDto);
    }

    
    @DeleteMapping("/delete")
    public ResponseEntity<ProductDTO> deleteProduct(@RequestBody ProductDTO productDto) {
        return productService.saveProduct(productDto);
    }
}
