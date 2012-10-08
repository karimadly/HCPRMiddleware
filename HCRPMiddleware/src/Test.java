

import java.util.Set;

import javax.jws.soap.SOAPBinding.Use;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sdlc.hcrp.HCRP;
import sdlc.hcrp.businessdomain.Client;
import sdlc.hcrp.businessdomain.User;
import sdlc.hcrp.factories.HibernateSessionFactory;






public class Test {

	
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		 HCRP test =  ctx.getBean("hcrpSystem",HCRP.class);
		 System.out.print(test.getClient(1).getClientManager());
		/* Set<Client> clients = test.getClientsByClientManagerId(2);
		 for(Client client : clients){
			 System.out.println(client.getClientName() + client.getGroups());
			 
		 }
		 */
		
	

		
		 }
}


