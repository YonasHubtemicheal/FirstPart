package YHStudentData;

import java.util.HashMap;
import java.util.List;

public class Module {
	private String moduleName;
	private String moduleID;
	private HashMap<String, List<Student>> ListOfStudents;
	
	//constructor
	public Module(String name, String id) {
		this.moduleName = name;
		this.moduleID = id;
		ListOfStudents = new HashMap<String, List<Student>>();
	}
	
	public void addStudents(String module, List<Student> studentList){
		ListOfStudents.put(module, studentList);
	}
	public HashMap<String, List<Student>> getListOfStudents(){
		return ListOfStudents;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	public String getModuleID() {
		return moduleID;
	}
}	
