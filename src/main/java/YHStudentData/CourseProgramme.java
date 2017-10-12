package YHStudentData;

import java.util.HashMap;
import java.util.List;

import org.joda.time.LocalDate;

public class CourseProgramme {
	private String courseName;
	private HashMap<String, List<Module>> ListOfModules;
	private LocalDate startDate, endDate;
	
	public CourseProgramme(String CN,LocalDate startDate,LocalDate endDate) {
		this.courseName = CN;
		this.ListOfModules = new HashMap<String, List<Module>>();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public void addModule(String course, List<Module> listOfMod){
		ListOfModules.put(course, listOfMod);
	}
	public HashMap<String, List<Module>> getListOfModule(){
		return ListOfModules;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	
	
}

