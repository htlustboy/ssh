package com.ssh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.ProductDao;
import com.ssh.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void saveProduct(Product product){
		productDao.saveProduct(product);
	}
}
