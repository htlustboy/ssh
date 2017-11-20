package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.ssh.model.Product;

public class TestHibernate {
	
	@Test
	public void test(){
		System.out.println("start.....");
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		StandardServiceRegistry serviceRegistry = standardServiceRegistryBuilder.build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setPrice(11.11f);
		product.setProductName("hello");
		System.out.println("product=================================:"+product);
		session.save(product);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("end.....");
		
	
	}

}
