/*programt to demonstrate on CRUD operation using JPA with
 * hibernate*/
//driver class
package org.tnsif.client;
import org.tnsif.entities.Employee;
import org.tnsif.service.EmployeeService;
import org.tnsif.service.EmployeeServiceImpl;
public class Client {
	public static void main(String[] args)
	{
		EmployeeService service = new EmployeeServiceImpl();
		Employee emp= new Employee();
		
//		emp.setId(102);
//		emp.setName("Ruchi Tare");
//		service.createEmployee(emp);
//		System.out.println("The data added Successfully in the database");
//		
		//update
//		emp.setId(101);
//		emp.setName("Ruchi T");
//		service.createEmployee(emp);
//		System.out.println("The data added Successfully in the database");
	
		//delete
		emp = service.retriveEmployee(101);
		service.deleteEmployee(emp);
		System.out.println("The data successfully deleted");
		
		//retrive
		emp = service.retriveEmployee(101);
		System.out.println("Emp ID: "+emp.getId());
		System.out.println("Emp Name:"+emp.getName());
	}
}
