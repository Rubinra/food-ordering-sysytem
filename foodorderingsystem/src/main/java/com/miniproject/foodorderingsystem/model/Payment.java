package com.miniproject.foodorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_id;
	@Column(nullable = false, length = 45)
	private String bank;
	@Column(nullable = false, length = 45)
	private String email;
	@Column(nullable = false, length = 45)
	private double price;
	@Column(nullable = false, length = 45, unique = true)
	private int bill;
	

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", bank=" + bank + ", email=" + email + ", price=" + price
				+ ", bill=" + bill + "]";
	}


}
