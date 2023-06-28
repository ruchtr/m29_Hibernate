package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {

	void createEmployee(Employee emp);//create
	Employee retriveEmployee(int id);//retrive
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
}
