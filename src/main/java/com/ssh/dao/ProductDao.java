package com.ssh.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.model.Product;

@Repository
@Transactional
public class ProductDao {
	
	private HibernateTemplate template;
	
	@Autowired
	public ProductDao(SessionFactory sessionFactory) {
		this.template = new HibernateTemplate(sessionFactory);
	}
	
	public void saveProduct(Product product){
		template.save(product);
	}
}
