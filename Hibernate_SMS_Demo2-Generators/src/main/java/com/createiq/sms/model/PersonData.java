package com.createiq.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_hib")
public class PersonData {
@Id
@Column(name = "person_id")
int person_id;
@Column(name = "person_name")
String Person_name;
@Column(name = "pesrson_age")
double person_age;
@Column(name = "person_email")
String person_email;
public PersonData() {
	// TODO Auto-generated constructor stub
}
public PersonData(int person_id, String person_name, double person_age, String person_email) {
	super();
	this.person_id = person_id;
	Person_name = person_name;
	this.person_age = person_age;
	this.person_email = person_email;
}
@Override
public String toString() {
	return "PersonData [person_id=" + person_id + ", Person_name=" + Person_name + ", person_age=" + person_age
			+ ", person_email=" + person_email + "]";
}
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public String getPerson_name() {
	return Person_name;
}
public void setPerson_name(String person_name) {
	Person_name = person_name;
}
public double getPerson_age() {
	return person_age;
}
public void setPerson_age(double person_age) {
	this.person_age = person_age;
}
public String getPerson_email() {
	return person_email;
}
public void setPerson_email(String person_email) {
	this.person_email = person_email;
}

	
}
