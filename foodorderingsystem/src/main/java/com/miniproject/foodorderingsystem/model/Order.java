package com.miniproject.foodorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bill;
	@Column(nullable = false, length = 45)
	private int quantity;
	@Column(nullable = false, length = 45)
	private int eid;
	@Column(nullable = false, length = 45)
	private double total_price;

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Order [bill=" + bill + ", quantity=" + quantity + ", eid=" + eid + ", total_price=" + total_price + "]";
	}

	
	

	

}
