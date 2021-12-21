package com.createiq.sms.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.createiq.sms.connection.SessionUtil;
import com.createiq.sms.model.Student;

public class Studentdaoimpl implements Studentdao {

	@Override
	public void insert(Student student) {
		Session session=SessionUtil.getSession();
		session.save(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
		
		
	}

	@Override
	public void delete(int sid) {
		Session session=SessionUtil.getSession();
		Student student=new Student();
		student.setSid(sid);
		
		session.delete(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
		
		
	}

	@Override
	public List<Student> findall() {
		
		Query<Student> query=SessionUtil.getSession().createQuery("from Student");
		
		return query.list();
		
		
	}

	@Override
	public Student findbyid(int sid) {
		Session session=SessionUtil.getSession();
		Student student=session.get(Student.class, sid);
		return student;
	}

	@Override
	public void update(Student student) {
		
		Session session=SessionUtil.getSession();
		session.update(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	}
//	public static void main(String[] args) {
//		
//		Studentdaoimpl studentdaoimpl=new Studentdaoimpl();
////		Student student=new Student(9001, "vennela_goud", 450000);
////		studentdaoimpl.insert(student);
//		
////		System.out.println(studentdaoimpl.findbyid(9001));
//		System.out.println(studentdaoimpl.findall());
//		
//	}
	

}
