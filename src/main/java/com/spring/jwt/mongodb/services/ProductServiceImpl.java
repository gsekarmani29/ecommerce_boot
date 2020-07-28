package com.spring.jwt.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jwt.mongodb.models.Product;
import com.spring.jwt.mongodb.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
}
