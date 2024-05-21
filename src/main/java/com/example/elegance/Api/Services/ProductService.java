package com.example.elegance.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.elegance.Domain.Product.Product;
import com.example.elegance.Domain.Product.ProductDTO;
import com.example.elegance.Domain.Product.ProductMapper;
import com.example.elegance.Domain.Product.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;


    public ResponseEntity<ProductDTO> saveProduct(ProductDTO productDTO) {

        Product product = productMapper.convertToEntity(productDTO);
        productRepository.save(product);

        return new ResponseEntity<>(productMapper.convertToDto(productRepository.findById(product.getId()).orElse(null)), HttpStatus.OK);
    }


}