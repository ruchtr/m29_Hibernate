package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create EMPLOYEE-1
		Employee emp = new Employee();
		emp.setEmpName("Ruchi Tare");
		emp.setSalary(30680.5f);
		em.persist(emp);
	}

}
