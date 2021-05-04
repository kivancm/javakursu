
public class Student extends User{

private String studentNumber;//sinif disinden erisimi engelledik
public String courseName;//sinif disinden erisimi engelledik
public Student() {
	
}
public Student (String _studentNumber,String _courseName) {
	this.studentNumber=_studentNumber;
	this.courseName=_courseName;
}
public String getStudentNumber() {//getter kapsülleme
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {//setter kapsülleme
	this.studentNumber = studentNumber;
}
public String getCourseName() {//getter kapsülleme
	return courseName;
}
public void setCourseName(String courseName) {//setter kapsülleme
	this.courseName = courseName;
}
}
