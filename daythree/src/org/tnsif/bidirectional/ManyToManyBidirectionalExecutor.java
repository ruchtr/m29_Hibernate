package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyBidirectionalExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p = new Product();
		p.setProductid(231);
		p.setProductname("Sanitizer");
		p.setPrice(90.80f);
		
		Product p1 = new Product();
		p1.setProductid(200);
		p1.setProductname("Comfort");
		p1.setPrice(67.80f);
		
		Order o = new Order();
		o.setOrderId(3311);
		o.setPurchasedate("12-02-2023");
		
		Order o1 = new Order();
		o1.setOrderId(3452);
		o1.setPurchasedate("9-02-2023");
		
		em.getTransaction().commit();
		System.out.println("aded succfully");
		em.close();
		factory.close();

	}

}
