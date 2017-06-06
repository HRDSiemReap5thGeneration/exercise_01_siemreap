package org.khmeracademy.repository;

import java.util.ArrayList;
import java.util.List;

import org.khmeracademy.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepoImp implements ProductRepo {
	
	private List<Product> products = new ArrayList<>();
	
	public ProductRepoImp(){
		Product p = new Product(1,"ABC",20.45);
		products.add(p);
		p = new Product(2,"Coca",8.00);
		products.add(p);
		p = new Product(3,"Pepsi",12.45);
		products.add(p);
		p = new Product(4,"Tiger",15.83);
		products.add(p);
	}
	
	@Override
	public List<Product> getProducts() {
		return products;
	}
	
}
