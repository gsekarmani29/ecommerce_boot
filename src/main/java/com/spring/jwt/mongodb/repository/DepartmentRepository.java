package com.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.jwt.mongodb.models.Department;

public interface DepartmentRepository extends MongoRepository<Department,String>{

}
