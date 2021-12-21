package com.createiq.sms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.sms.model.PersonData;

public class InsertPerson {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		PersonData data=new PersonData(1002, "vennela", 2888, "vennela@gmail.com");
		session.save(data);
		session.beginTransaction().commit();
		session.close();

	}

}
