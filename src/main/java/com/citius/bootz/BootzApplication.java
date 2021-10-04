package com.citius.bootz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citius.bootz.facade.ProductDTO;
import com.citius.bootz.facade.ProductFacade;

@SpringBootApplication
public class BootzApplication implements CommandLineRunner {

	@Autowired
	private ProductFacade productFacade;

	public static void main(String[] args) {
		SpringApplication.run(BootzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * ProductDTO pdto = new ProductDTO(); pdto.setName("USB"); pdto.setPrice(500);
		 * 
		 * System.out.println(productFacade.save(pdto).getId() + " saved.....");
		 * 
		 * productFacade.getProducts().stream().forEach(System.out::println);
		 */

		System.out.println(productFacade.getProduct(1));
		
	}

}
