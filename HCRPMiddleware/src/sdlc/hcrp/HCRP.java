package sdlc.hcrp;


import org.hibernate.SessionFactory;

import sdlc.hcrp.dao.UserDAO;
import sdlc.hcrp.factories.HibernateSessionFactory;


public class HCRP {

	HibernateSessionFactory sessionFactory;
	
	public HCRP(HibernateSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory; 
	}
	
	public void createUser(String username){
		UserDAO user = new UserDAO(sessionFactory.getSessionFactory());
		user.createUser(username);
		
	}
}
