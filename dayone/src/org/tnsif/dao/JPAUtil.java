package org.tnsif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	//Entity Manager-CURD methods
	//create->persist(obj);
	//retrieve->find(PK);
	//update->merge(obj);
	//delete->remove(PR);
	
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	
	//JPA runtime Lifecycle
	/*to create object of entity manager if the object
	 * is not created then create it with
	 * factory.createEntitymanager*/
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
		
	}
}
