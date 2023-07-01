package org.tnsif.jointtableinheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Vehical")
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehical {
	@Id
	private int VehicalNo;
	private int speed;
	private String type;
	private float price;
	public int getVehicalNo() {
		return VehicalNo;
	}
	public void setVehicalNo(int vehicalNo) {
		VehicalNo = vehicalNo;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
