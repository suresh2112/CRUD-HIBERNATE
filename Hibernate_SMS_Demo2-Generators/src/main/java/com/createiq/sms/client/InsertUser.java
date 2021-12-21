package com.createiq.sms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.sms.model.UserData;

public class InsertUser {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		UserData data=new UserData(1002, "suresh", 28);
		session.save(data);
		session.beginTransaction().commit();
		session.close();
		
	

	}

}
