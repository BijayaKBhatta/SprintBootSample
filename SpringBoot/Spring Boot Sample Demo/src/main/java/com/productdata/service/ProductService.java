package com.productdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productdata.dao.ProductDAO;
import com.productdata.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;

	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}
}
