package com.scp.apptest;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.scp.NamedNative.queries.Passport;
import com.scp.name.queries.Passenger;
import com.scp.utility.DBSessionFactory;

public class NamedQueryApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		System.out.println("!!!!.........Named Native Queries Test........!!!!!");
		System.out.println("All Passenger");
		List<Passport> list = session.getNamedQuery("GetAllPassport").list();
		System.out.println(list);
		Iterator<Passport> it = list.iterator();
		while (it.hasNext()) {
			Passport passport = (Passport) it.next();
			System.out.println(passport);
		}

		System.out.println("\n\nGet Specific Employee");
		org.hibernate.Query query = session.getNamedQuery("GetPassport");
		query.setInteger("id", 2);
		List<Passport> list1 = query.list();
		Iterator<Passport> it1 = list1.iterator();
		while (it1.hasNext()) {
			Passport passport = (Passport) it1.next();
			System.out.println(passport);
		}
		session.close();
		Session session1 = DBSessionFactory.sf.openSession();
		System.out.println("!!!!.........Named Queries Test........!!!!!");
		System.out.println("All Passenger");
		List<Passenger> list2 = session1.getNamedQuery("GetAllPasserger").list();
		Iterator<Passenger> it2=list2.iterator();
		while (it2.hasNext()) {
			Passenger passenger = (Passenger) it2.next();
			System.out.println(passenger);	
		}

		System.out.println("\n\nGet Specific Employee");
		org.hibernate.Query query1 = session1.getNamedQuery("GetPasserger");
		query.setInteger("id", 2);
		List<Passenger> list3 = query1.list();
		System.out.println(list3);

	}
}
