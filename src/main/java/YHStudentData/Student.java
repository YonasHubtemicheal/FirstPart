package YHStudentData;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student {
	private String FName, SName;
	private int Age, ID;
	private LocalDate DOB;
	LocalDate Today = new LocalDate();
	private String userName;
	
	public Student(String fName, String sName, LocalDate dob, int id) {
		this.FName = fName;
		this.SName = sName;
		this.DOB = dob;
		this.ID = id;
		this.Age = Years.yearsBetween(DOB, Today).getYears();		
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getFName() {
		return FName;
	}	
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSName() {
		return SName;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public int getAge() {
		return Age;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getID() {
		return ID;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsername() {
		String age = Integer.toString(getAge());
		userName = getFName().concat(getSName()).concat(age);
		return  userName;
	}
	
}