package org.tnsif.service;

import org.tnsif.dao.EmployeeDao;
import org.tnsif.dao.EmployeeDaoTmp1;
import org.tnsif.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	
	public EmployeeServiceImpl()
	{
		dao=new EmployeeDaoTmp1();
	}
	
	@Override
	public void createEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee retriveEmployee(int id) {
		Employee emp = dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

}
