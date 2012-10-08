package sdlc.hcrp.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import sdlc.hcrp.businessdomain.Client;
import java.util.List;
import sdlc.hcrp.businessdomain.Client;

public class ClientDAO {

	private SessionFactory sessionFactory;

	public ClientDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public Set<Client> geClientsbyClientManagerId(int userID) {
		Session session = sessionFactory.openSession();
		String queryString = "select client from Client client  "
				+ "inner join client.clientManager as clientManager with clientManager.id = :userID "
				+ "left join fetch client.groups";
		Query query = session.createQuery(queryString);
		query.setParameter("userID", userID);
		List<Client> clients = (List<Client>) query.list();
		return new HashSet<Client>(clients);
	}

	public Client getClient(int clientID) {
		Session session = sessionFactory.openSession();
		Client client = (Client) session.get(Client.class, clientID);
		return client;

	}
}
