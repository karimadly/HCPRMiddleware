package sdlc.hcrp.businessdomain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table (name= "tblclients")
public class Client {
	
	@Id
	@GeneratedValue
	@Column(name = "clId")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="clMgr")
	private int clientManager;
	@Column(name="clNm")
	private String clientName;
	@Column(name="ClRm")
	private int renewalMont;
	@OneToMany(mappedBy="client", fetch = FetchType.EAGER)	
	private Set<Group> groups;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClientManager() {
		return clientManager;
	}
	public void setClientManager(int clientManager) {
		this.clientManager = clientManager;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getRenewalMont() {
		return renewalMont;
	}
	public void setRenewalMont(int renewalMont) {
		this.renewalMont = renewalMont;
	}
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
	
	
}
