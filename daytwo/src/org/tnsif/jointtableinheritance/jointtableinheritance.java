package org.tnsif.jointtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jointtableinheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Vehical v=new Vehical();
		v.setVehicalNo(4512);
		v.setSpeed(45);
		v.setPrice(451355);
		v.setType("four wheeler");
		em.persist(v);
		
		Vehical v1=new Vehical();
		v1.setVehicalNo(5512);
		v1.setSpeed(60);
		v1.setPrice(165495);
		v1.setType("four wheeler");
		em.persist(v1);
		
		Car c =new Car();
		c.setBrandName("honda");
		c.setPrice(5616445);
		c.setSpeed(50);
		c.setType("four wheelwer");
		c.setVehicalNo(45123);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("aded succfully");
		em.close();
		factory.close();
		
	}

}
