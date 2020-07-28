package com.spring.jwt.mongodb.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jwt.mongodb.models.Category;
import com.spring.jwt.mongodb.models.Department;
import com.spring.jwt.mongodb.models.Product;
import com.spring.jwt.mongodb.models.Variant;
import com.spring.jwt.mongodb.services.ProductServiceImpl;

@RestController
public class IndexController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
			return productServiceImpl.getAllProducts();
	}
	public Product getProductByID(@PathVariable String productId)
	{
		return null;
	}
	public List<Variant> getVariantProductByID(@PathParam("productId") String productId)
	{
		return null;
	}
	public Variant getVariantByID(@PathParam("id") String id)
	{
		return null;
	}
	public List<Department> getAllDepartments()
	{
		return null;
	}
	public List<Category> getAllCategories()
	{
		return null;
	}
	
}
