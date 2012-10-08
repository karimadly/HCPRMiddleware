package sdlc.hcrp.dao;

import org.hibernate.SessionFactory;

import sdlc.hcrp.businessdomain.Group;

public class GroupDAO {

	private SessionFactory sessionFactory;
	
	public GroupDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public Group getGroup(int groupID){
		return null;
	}
}
