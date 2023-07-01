package org.tnsif.tableperclassinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.tnsif.singletableinheritance.Employee;
import org.tnsif.singletableinheritance.Manager;
//driver class
//program to demonstrate on Table per class inheritance
public class TablePerClassInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//citizen 1
		Citizen c=new Citizen();
		c.setAadharNo(567834569802L);
		c.setCity("Pune");
		c.setArea("Viman Nagar");
		em.persist(c);
		
		//citizen 2
		Citizen c1=new Citizen();
		c1.setAadharNo(367634569802L);
		c1.setCity("Mumbai");
		c1.setArea("Bandra-West");
		em.persist(c1);
		
		//person1
		Person p=new Person();
		p.setAadharNo(789064578900L);
		p.setCity("Nashik");
		p.setArea("Gangapur Road");
		p.setName("Shiwani K");
		p.setContactNo(7890768900L);
		em.persist(p);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		

	}

	

}