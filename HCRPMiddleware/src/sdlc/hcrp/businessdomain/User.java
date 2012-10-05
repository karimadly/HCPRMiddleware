package sdlc.hcrp.businessdomain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table (name= "tblusers")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "mgrId")
	private int id;
	@Column(name = "mgrName")
	private String name;	
	@OneToMany(mappedBy="clientManager",fetch= FetchType.LAZY)
	private Set<Client> clients;
	
	public User(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	
	
	
}
