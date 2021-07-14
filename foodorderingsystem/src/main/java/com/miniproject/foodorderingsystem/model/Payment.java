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
	private double total_price;
	@Column(nullable = false, length = 45, unique = true)
	private int oid;
	@Column(nullable = false, length = 45, unique = true)
	private String address;

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

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", bank=" + bank + ", total_price=" + total_price + ", oid=" + oid
				+ ", address=" + address + "]";
	}

}
