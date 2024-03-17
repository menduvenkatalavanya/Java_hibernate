package com.techpalle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Emp;

public class MyProgram {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
	//creating rows in the table	
//		Emp e1 = new  Emp(1, "Sanath", "1,50,000", "Python Developer");
//		Emp e2 = new  Emp(2, "Lally", "2,50,000", "Java Developer");
//		Emp e3 = new Emp(3, "Steve", "20,000", "HR");
//		
//		s.save(e1);
//		s.save(e2);
//		s.save(e3);
		
    //reading rows from the table
		Emp e2 = s.get(Emp.class, 2);
		System.out.println(e2.getEno());
		System.out.println(e2.getEname());
		System.out.println(e2.getEsal());
		System.out.println(e2.getEdesignation());
	//Updating rows 
		Emp e1 = s.get(Emp.class, 1);
		e1.setEname("Sanath Kumar");
		s.save(e1);
	//Deleting rows from the table
		Emp e3 = s.get(Emp.class, 3);
		s.delete(e3);
		t.commit();
		
		s.close();
		factory.close();

	}

}
