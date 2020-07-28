package com.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.jwt.mongodb.models.Variant;

public interface VariantRepository extends MongoRepository<Variant,String>{

}
