package com.citius.bootz.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.bootz.model.Product;
import com.citius.bootz.service.ProductService;

@Service
public class ProductFacadeImpl  implements ProductFacade{

	@Autowired
	private ProductService productService;
	
	public List<ProductDTO> getProducts(){
		List<Product> products = productService.getAll();
		List<ProductDTO> dtos = new ArrayList<>();
		for(Product p: products) {
			ProductDTO pdto = new ProductDTO(p);
			dtos.add(pdto);
		}
		return dtos;
	}
	@Override
	public ProductDTO save(ProductDTO productDTO) {
		
		return  new ProductDTO(productService.save(productDTO.getEntity()));
		
	}
		
}
