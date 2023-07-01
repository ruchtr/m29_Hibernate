package org.tnsif.jointtableinheritance;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Car")
public class Car extends Vehical{
	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
