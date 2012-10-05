package sdlc.hcrp.businessdomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tblusers")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "mgrId")
	private int id;
	@Column(name = "mgrName")
	private String name;
	
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
	
	
}
