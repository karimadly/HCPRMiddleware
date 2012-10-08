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
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table (name= "tblclients")
public class Client {
	
	@Id
	@GeneratedValue
	@Column(name = "clId")
	private int id;
	@ManyToOne
	@JoinColumn(name="clMgr")
	private User clientManager;
	@Column(name="clNm")
	private String clientName;
	@Column(name="ClRm")
	private int renewalMont;
	@OneToMany(mappedBy="client")
	private Set<Group> groups;
	
	public Client(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getClientManager() {
		return clientManager;
	}
	public void setClientManager(User clientManager) {
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return id == ((Client)obj).id ? true:false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String temp = Integer.toString(id);
		return temp.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ClientID: " + id +"\n ClientName: "+ clientName;
	}
	
	
	
	
}
