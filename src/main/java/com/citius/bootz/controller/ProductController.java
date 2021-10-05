package com.citius.bootz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citius.bootz.facade.ProductDTO;
import com.citius.bootz.facade.ProductFacade;

@RestController
public class ProductController {

	@Autowired
	private ProductFacade productFacade;

	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/products",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ProductDTO>> getProducts() {
		return new ResponseEntity<List<ProductDTO>>(productFacade.getProducts(),HttpStatus.OK);
		
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> getProduct(@PathVariable("id") int id) {
		ProductDTO p = productFacade.getProduct(id);
		return new ResponseEntity<ProductDTO>(p,HttpStatus.OK);
	}
	@PostMapping("/products")
	public ResponseEntity<ProductDTO>  save(@RequestBody ProductDTO p) {
		productFacade.save(p);
		return new ResponseEntity<ProductDTO>(p,HttpStatus.OK);

	} 

}
