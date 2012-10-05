package sdlc.hcrp.businessdomain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Member {
	
	@ManyToOne
	@JoinColumn(name="contractHolderId")
	private ContactHolder contractHolder;
	private int age;
	private String relationshipCode;

}
