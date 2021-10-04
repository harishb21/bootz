package com.citius.bootz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.citius.bootz.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {

	public List<Product> findAll();
	public Product findById(int id);
	
	@Query("select p.price from Product p where p.id=?1 and p.name=?2")
	public double  findByIdAndName(int id,String name);

	public Product findByName(String name);
	
	@Query("select p.name from Product p where p.price = :pricevar")
	public String findByPrice( @Param("pricevar") double   price);
	
	
}
