package org.tnsif.bidirectional;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="oeder")
public class Order {
	@Id
	private int orderid;
	private Date purchasedate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set <Order>orders= new HashSet<>();
	private Product product;

	public Order() {
		
	}

	public Order(int orderid, Date purchasedate, Product product) {
		super();
		this.orderid = orderid;
		this.purchasedate = purchasedate;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", purchasedate=" + purchasedate + ", product=" + product + "]";
	}

	public void setOrderId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setPurchasedate(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
