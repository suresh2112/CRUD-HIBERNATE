package com.createiq.sms.dao;

import java.util.List;

import com.createiq.sms.model.Student;

public interface Studentdao {
	public void insert(Student student);
	public void delete(int sid);
	public List<Student> findall();
	public Student findbyid(int sid);
	public void update(Student student);
	
	

}
