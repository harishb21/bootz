package com.citius.bootz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citius.bootz.dao.ProductDAO;
import com.citius.bootz.model.Product;
import com.citius.bootz.service.ProductService;

@SpringBootApplication
public class BootzApplication implements CommandLineRunner {

	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(BootzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		productService.getAll().stream().forEach(System.out::println);

		// save();

		// findAll();
		// findById();
	//findByPrice();
	//	findByIdAndName();
	}

	private void findByIdAndName() {
		System.out.println(productDAO.findByIdAndName(1, "Marker"));
	}

	private void findByPrice() {
		System.out.println(productDAO.findByPrice(10));
	}

	private void findById() {
		System.out.println(productDAO.findById(2));
	}

	private void findAll() {
		productDAO.findAll().stream().forEach(System.out::println);
	}

	private void save() {
		Product p = new Product("Marker", 20);
		Product resp = productDAO.save(p);
		System.out.println(resp.getId() + "saved");
	}

}
