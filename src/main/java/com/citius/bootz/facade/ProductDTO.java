package com.citius.bootz.facade;

import java.io.Serializable;

import com.citius.bootz.model.Product;

public class ProductDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double price;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(Product p ) {
		this.id = p.getId();
		this.name = p.getName();
		this.price = p.getPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getId() + " : " + getName() + " : " + getPrice();
	}
	
	public Product entity() {
		Product p =  new Product(getName(),getPrice());
		return p;
	}
}
