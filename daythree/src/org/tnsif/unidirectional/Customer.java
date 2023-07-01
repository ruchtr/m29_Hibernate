package org.tnsif.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")

public class Customer{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custid;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	public Customer() {
		System.out.println("One To One -Undirectional");
	}

	public Customer(int custid, String name, Address address) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + "]";
	}

	public void setName(String string) {
		
		
	}

	public void setAddress(Address ad) {
		
		
	}
	
	
	
	
}
