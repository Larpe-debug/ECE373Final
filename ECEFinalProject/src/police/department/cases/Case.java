package police.department.cases;

import java.sql.Date;
import java.util.ArrayList;

import police.department.users.*;

public class Case {
	
	private enum caseStatus{
		SOLVED, IN_PROGRESS, COLD
	}
	
	private enum Offense{
		//TODO: add offense types, see jacob
	}

	private long caseNumber;
	private Date startDate;
	private Detective assigned;
	private caseStatus status;
	private ArrayList<Suplement> suplements;
	private ArrayList<Person> victim;
	private ArrayList<Person> suspect;
	private ArrayList<Person> witness;
	private String Address;
	private ArrayList<Offense> Offences;
	private ArrayList<Item> property;
	
	public Case(){
		//TODO: complete constructor
	}
	
	//TODO: add getters and setters
}
