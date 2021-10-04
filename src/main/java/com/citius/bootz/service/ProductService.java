package com.citius.bootz.service;

import java.util.List;

import com.citius.bootz.model.Product;

public interface ProductService {

	
	public Product save(Product product);
	public List<Product> getAll();
}
