
public class Instructor extends User {
	
	private String employeeNumber;//sinif disinden erisimi engelledik
	private String department;//sinif disinden erisimi engelledik
	public String getEmployeeNumber() {//getter kaps�lleme
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {//setter kaps�lleme
		this.employeeNumber = employeeNumber;
	}
	public String getDepartment() {//getter kaps�lleme
		return department;
	}
	public void setDepartment(String department) {//setter kaps�lleme
		this.department = department;
	}
	
}
