package sdlc.hcrp.dao;


import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import sdlc.hcrp.businessdomain.Client;
import sdlc.hcrp.businessdomain.User;
import sdlc.hcrp.factories.HibernateSessionFactory;


public class UserDAO {

	SessionFactory sessionFactory;
	
	public UserDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	

}
