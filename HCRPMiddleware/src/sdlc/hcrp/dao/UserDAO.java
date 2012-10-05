package sdlc.hcrp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import sdlc.hcrp.businessdomain.User;
import sdlc.hcrp.factories.HibernateSessionFactory;


public class UserDAO {

	SessionFactory sessionFactory;
	
	public UserDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public void createUser(String userName) {
		try {
			
			Session session = sessionFactory.openSession();
			User user = new User();
			Transaction tx = session.beginTransaction();
			user.setName(userName);
			session.save(user);
			tx.commit();
			session.close();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
