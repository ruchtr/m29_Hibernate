//driver class
//program to demonstrate undirectional one to one mapping.

package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c = new Customer();
		c.setName("Ruchi");
		
		Address ad = new Address();
		ad.setPincode(440223);
		ad.setCity("Mumbai");
		ad.setArea("Shivaji Marga");
		
		c.setAddress(ad);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("aded succfully");
		em.close();
		factory.close();
		
	}


	}


