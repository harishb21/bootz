package com.citius.bootz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.bootz.dao.ProductDAO;
import com.citius.bootz.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getAll(){
		return productDAO.findAll();
	}

}
