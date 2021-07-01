package com.miniproject.foodorderingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(nullable = false, length = 45)
	private String uname;
	@Column(nullable = false, length = 45)
	private String password;
	@Column(nullable = false, length = 45)
	private String email;
	@Column(nullable = false, length = 45)
	private String usertype;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", email=" + email + ", usertype="
				+ usertype + "]";
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorderingsystem", "root",
					"rubin@123");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static ResultSet validate(String n, String p) {
		ResultSet rs = null;
		try {
			Connection con = User.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where uname=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rs;
	}

}
