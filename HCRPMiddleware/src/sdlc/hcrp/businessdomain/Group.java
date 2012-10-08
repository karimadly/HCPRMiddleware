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
@Table (name= " tblgroups")
@BatchSize(size = 10)
public class Group {
	@Id
	@GeneratedValue
	@Column(name = "gid")
	private int id;
	@ManyToOne
	@JoinColumn(name="clid")
	private Client client;
	@OneToMany(mappedBy="group",fetch= FetchType.LAZY)
	private Set<ContractHolder> contractHolders;
	@Column(name="gnm")
	private String name;
	@Column(name="igr")
	private float individualGroupRate;
	@Column(name="rcat")
	private String ratingCtegory;
	@Column(name="mbrf")
	private float medicalBenefitRichnessFactor;
	@Column(name="dbrf")
	private float drugBenefitRichnessFactor;
	@Column(name="mrpc")
	private float medicalRetentionValue;
	@Column(name="drpcpm")
	private float drugPerClientPerMonthCost;
	@Column(name="drpc")
	private float drugRetentionValue;
	@Column(name="mrpcpm")
	private float medicalPerClientPerMonthCost;
	@Column(name="dgci")
	private char drugInclusionFlag;
	@Column(name="gfpn")
	private boolean grandfatheredPlanFlag;
	
	public Group(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getIndividualGroupRate() {
		return individualGroupRate;
	}
	public void setIndividualGroupRate(float individualGroupRate) {
		this.individualGroupRate = individualGroupRate;
	}
	public String getRatingCtegory() {
		return ratingCtegory;
	}
	public void setRatingCtegory(String ratingCtegory) {
		this.ratingCtegory = ratingCtegory;
	}
	public float getMedicalBenefitRichnessFactor() {
		return medicalBenefitRichnessFactor;
	}
	public void setMedicalBenefitRichnessFactor(float medicalBenefitRichnessFactor) {
		this.medicalBenefitRichnessFactor = medicalBenefitRichnessFactor;
	}
	public float getDrugBenefitRichnessFactor() {
		return drugBenefitRichnessFactor;
	}
	public void setDrugBenefitRichnessFactor(float drugBenefitRichnessFactor) {
		this.drugBenefitRichnessFactor = drugBenefitRichnessFactor;
	}
	public float getMedicalRetentionValue() {
		return medicalRetentionValue;
	}
	public void setMedicalRetentionValue(float medicalRetentionValue) {
		this.medicalRetentionValue = medicalRetentionValue;
	}
	public float getDrugPerClientPerMonthCost() {
		return drugPerClientPerMonthCost;
	}
	public void setDrugPerClientPerMonthCost(float drugPerClientPerMonthCost) {
		this.drugPerClientPerMonthCost = drugPerClientPerMonthCost;
	}
	public float getDrugRetentionValue() {
		return drugRetentionValue;
	}
	public void setDrugRetentionValue(float drugRetentionValue) {
		this.drugRetentionValue = drugRetentionValue;
	}
	public float getMedicalPerClientPerMonthCost() {
		return medicalPerClientPerMonthCost;
	}
	public void setMedicalPerClientPerMonthCost(float medicalPerClientPerMonthCost) {
		this.medicalPerClientPerMonthCost = medicalPerClientPerMonthCost;
	}
	public char getDrugInclusionFlag() {
		return drugInclusionFlag;
	}
	public void setDrugInclusionFlag(char drugInclusionFlag) {
		this.drugInclusionFlag = drugInclusionFlag;
	}
	public boolean isGrandfatheredPlanFlag() {
		return grandfatheredPlanFlag;
	}
	public void setGrandfatheredPlanFlag(boolean grandfatheredPlanFlag) {
		this.grandfatheredPlanFlag = grandfatheredPlanFlag;
	}
	
	

}
