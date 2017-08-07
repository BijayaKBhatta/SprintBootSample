package com.productdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.productdata.model.Product;
import com.productdata.service.ProductService;

@RestController
@RequestMapping(value = "/productdata")
public class ProductController{
	@Autowired
	ProductService productService;

	@PostMapping("/product/add")
	public String addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return productService.addProduct(product);
	}
   //http://127.0.0.1:8080/productdata/id
	@GetMapping("/product/{id}")
	public Product getProductbyId(@PathVariable String id) {
		// TODO Auto-generated method stub
		return new Product(10, "Altaf");
	}
	
	
	
	//http://127.0.0.1:8080/productdata?id=10
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Product getitem(@RequestParam("id") String itemid){
		int id= itemid.length();
		return new Product(id, "Altaf");		
	}

}
