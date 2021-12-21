package com.createiq.sms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.sms.dao.Studentdao;
import com.createiq.sms.dao.Studentdaoimpl;
import com.createiq.sms.model.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session  session=sessionFactory.openSession();
//		Studentdao studentdao=new Studentdaoimpl();
//		Employee employee=new Employee(1001, "hyd",270000);
		Employee employee=new Employee();
		employee.setEname("shatakshi");
		employee.setEsal(340000);
		session.save(employee);
		session.beginTransaction().commit();
		session.close();
		
		
		
		
	}
	

}
