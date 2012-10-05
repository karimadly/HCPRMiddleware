package sdlc.hcrp;


import org.hibernate.SessionFactory;


import sdlc.hcrp.factories.HibernateSessionFactory;


public class HCRP {

	HibernateSessionFactory sessionFactory;
	
	public HCRP(HibernateSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory; 
	}
	
	
	
	
}
