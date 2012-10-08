package sdlc.hcrp;


import java.util.Set;

import org.hibernate.SessionFactory;


import sdlc.hcrp.businessdomain.Client;
import sdlc.hcrp.dao.ClientDAO;
import sdlc.hcrp.factories.HibernateSessionFactory;


public class HCRP {

	HibernateSessionFactory sessionFactory;
	
	public HCRP(HibernateSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory; 
	}
	
	public Client getClient(int clientID){
		ClientDAO client = new ClientDAO(sessionFactory.getSessionFactory());
		return client.getClient(clientID);
	}
	public Set<Client> getClientsByClientManagerId(int userID){
		ClientDAO client = new ClientDAO(sessionFactory.getSessionFactory());
		return client.geClientsbyClientManagerId(userID);
	}
	
	
	
	
}
