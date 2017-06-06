package org.khmeracademy.controller;

import java.util.List;

import org.khmeracademy.model.Product;
import org.khmeracademy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value={"/","/index"})
	public String index(){
		System.out.println("/index request");
		return "index";
	}
	@RequestMapping(value={"/product"})
	public String product(ModelMap m){
		System.out.println("/product request");
		List<Product> products = productService.getProducts();
		m.addAttribute("mario", products);
		
//		products.forEach(pro -> System.out.println(pro));
		
		return "product";
	}
}
