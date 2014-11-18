package police.department.cases;

import java.awt.image.BufferedImage;
import java.sql.Date;

public class Person {
	
	private class Height{
		private int feet;
		private int inches;
		
		private Height(int feet, int inches){
			this.feet = feet;
			this.inches = inches;
		}
	}
	
	private class Employer{
		//TODO: add on fields and methods
	}
	
	private enum Race{
		CAUCASION, AFRICAN_AMERICAN
	}
	
	private enum HairColor{
		BROWN, BLACK, BLOND 
	}
	
	private enum MaritalStatus{
		MARRIED, SINGLE
	}
	private String name;
	private String Address;
	private int age;
	private Date birthday;
	private Height height;
	private MaritalStatus married;
	private Race race;
	private HairColor hair;
	private int SSN;
	private int cell;
	private int phone;
	private Employer empoloyer;
	private BufferedImage photo;
	
	public Person(){
		//TODO: complete
	}
	
	//TODO: add getters and setters
}
