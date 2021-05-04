
public class Instructor extends User {
	
	private String employeeNumber;//sinif disinden erisimi engelledik
	private String department;//sinif disinden erisimi engelledik
	public String getEmployeeNumber() {//getter kapsülleme
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {//setter kapsülleme
		this.employeeNumber = employeeNumber;
	}
	public String getDepartment() {//getter kapsülleme
		return department;
	}
	public void setDepartment(String department) {//setter kapsülleme
		this.department = department;
	}
	
}
