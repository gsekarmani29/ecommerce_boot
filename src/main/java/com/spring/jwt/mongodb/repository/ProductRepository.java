package com.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.jwt.mongodb.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>{

}
