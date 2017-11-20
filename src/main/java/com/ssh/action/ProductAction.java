package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.Product;
import com.ssh.service.ProductService;

@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Autowired
	private ProductService productService;
	
	public String saveProduct(){
		productService.saveProduct(product);
		this.addActionMessage("保存成功...");
		return "success";
	}
}
