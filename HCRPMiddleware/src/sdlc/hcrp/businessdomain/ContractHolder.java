package sdlc.hcrp.businessdomain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table (name= "tblcontactholders")
public class ContractHolder {
	@Id
	@GeneratedValue
	@Column(name = "contractHolderId")
	private int id;
	@ManyToOne
	@JoinColumn(name="gid")
	private Group group;
	private char gender;
	private String contractType;
	private int tobacco;
	private String countyState;
	private float escMonthlyRate;
	private float escMedicalRate;	
	private float escDrugRate;
	private String axciomA;
	private String axciomB;
	private String axciomC;
	private int memberCount;
	@OneToMany(mappedBy ="contractHolder")
	private Set<Member> members;
	
	public ContractHolder(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public int getTobacco() {
		return tobacco;
	}
	public void setTobacco(int tobacco) {
		this.tobacco = tobacco;
	}
	public String getCountyState() {
		return countyState;
	}
	public void setCountyState(String countyState) {
		this.countyState = countyState;
	}
	public float getEscMonthlyRate() {
		return escMonthlyRate;
	}
	public void setEscMonthlyRate(float escMonthlyRate) {
		this.escMonthlyRate = escMonthlyRate;
	}
	public float getEscMedicalRate() {
		return escMedicalRate;
	}
	public void setEscMedicalRate(float escMedicalRate) {
		this.escMedicalRate = escMedicalRate;
	}
	public float getEscDrugRate() {
		return escDrugRate;
	}
	public void setEscDrugRate(float escDrugRate) {
		this.escDrugRate = escDrugRate;
	}
	public String getAxciomA() {
		return axciomA;
	}
	public void setAxciomA(String axciomA) {
		this.axciomA = axciomA;
	}
	public String getAxciomB() {
		return axciomB;
	}
	public void setAxciomB(String axciomB) {
		this.axciomB = axciomB;
	}
	public String getAxciomC() {
		return axciomC;
	}
	public void setAxciomC(String axciomC) {
		this.axciomC = axciomC;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	
	



}
