package com.citius.bootz.facade;

import java.util.List;

public interface ProductFacade {
	
	public ProductDTO save(ProductDTO productDTO);
	public List<ProductDTO> getProducts();
	
	

}
