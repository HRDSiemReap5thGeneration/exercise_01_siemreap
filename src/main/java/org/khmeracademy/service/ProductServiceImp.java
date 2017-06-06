package org.khmeracademy.service;

import java.util.List;

import org.khmeracademy.model.Product;
import org.khmeracademy.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
	
	private ProductRepo products;
	
	@Autowired
	public ProductServiceImp(ProductRepo pp){
		this.products = pp;
	}
	
	@Override
	public List<Product> getProducts() {
		List<Product> lst = products.getProducts();
		return lst;
	}
}
