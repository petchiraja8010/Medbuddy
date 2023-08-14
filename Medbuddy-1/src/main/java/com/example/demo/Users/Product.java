package com.example.demo.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product { 
@Id

private int User_Id;
private String User_name;
private long phonenumber;
public int getUser_Id() {
	return User_Id;
}
public void setUser_Id(int user_Id) {
	User_Id = user_Id;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int user_Id, String user_name, long phonenumber) {
	super();
	User_Id = user_Id;
	User_name = user_name;
	this.phonenumber = phonenumber;
}
public String getUser_name() {
	return User_name;
}
public void setUser_name(String user_name) {
	User_name = user_name;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}


}
