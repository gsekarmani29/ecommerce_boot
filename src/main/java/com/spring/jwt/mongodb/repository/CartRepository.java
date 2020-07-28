package com.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.jwt.mongodb.models.Cart;

public interface CartRepository extends MongoRepository<Cart,String>{

}
