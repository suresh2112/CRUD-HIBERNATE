package com.createiq.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="user_table")

public class UserData {
	

	
@Id
@Column(name="userid")

int	user_id;
@Column(name = "username")
String user_name;
@Column(name = "userage")
double user_age;
public UserData() {
	// TODO Auto-generated constructor stub
}
public UserData(int user_id, String user_name, double user_age) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_age = user_age;
}
@Override
public String toString() {
	return "UserData [user_id=" + user_id + ", user_name=" + user_name + ", user_age=" + user_age + "]";
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public double getUser_age() {
	return user_age;
}
public void setUser_age(double user_age) {
	this.user_age = user_age;
}


}
