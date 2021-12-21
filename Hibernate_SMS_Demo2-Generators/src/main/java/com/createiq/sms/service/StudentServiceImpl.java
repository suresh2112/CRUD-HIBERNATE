package com.createiq.sms.service;

import java.util.List;

import com.createiq.sms.dao.Studentdao;
import com.createiq.sms.dao.Studentdaoimpl;
import com.createiq.sms.model.Student;

public class StudentServiceImpl implements StudentSerive{
	Studentdao service=new Studentdaoimpl();

	@Override
	public void insert(Student student) {
		service.insert(student);
		
		
	}

	@Override
	public void delete(int sid) {
		service.delete(sid);
		
	}

	@Override
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return service.findall();
	}

	@Override
	public Student findbyid(int sid) {
		// TODO Auto-generated method stub
		return service.findbyid(sid);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		service.update(student);
		
	}

}
