
public class Student extends User{

private String studentNumber;//sinif disinden erisimi engelledik
public String courseName;//sinif disinden erisimi engelledik
public Student() {
	
}
public Student (String _studentNumber,String _courseName) {
	this.studentNumber=_studentNumber;
	this.courseName=_courseName;
}
public String getStudentNumber() {//getter kaps�lleme
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {//setter kaps�lleme
	this.studentNumber = studentNumber;
}
public String getCourseName() {//getter kaps�lleme
	return courseName;
}
public void setCourseName(String courseName) {//setter kaps�lleme
	this.courseName = courseName;
}
}
