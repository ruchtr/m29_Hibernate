package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao {
	
	//by defalut abstract method
	//user defined method for CURD operation
	void addEmployee(Employee emp);//create
	Employee getEmployee(int id);//retrive
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	//JPA transaction
	void beginTransaction();//begin
	void commitTransaction();//close
}
