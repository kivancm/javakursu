
public class User {
private int id;//sinif disinden erisimi engelledik
private String userName;//sinif disinden erisimi engelledik
private String firstName;//sinif disinden erisimi engelledik
private String lastName;//sinif disinden erisimi engelledik
	public User() {//new'leyince constructor calisir 
	System.out.println("kullanici kaydi yapildi.");
	}
	public int getId() {//getter kaps�lleme
		return id;
	}
	public void setId(int id) {//setter kaps�lleme
		this.id = id;
	}
	public String getUserName() {//getter kaps�lleme
		return userName;
	}
	public void setUserName(String userName) {//setter kaps�lleme
		this.userName = userName;
	}
	public String getFirstName() {//getter kaps�lleme
		return firstName;
	}
	public void setFirstName(String firstName) {//setter kaps�lleme
		this.firstName = firstName;
	}
	public String getLastName() {//getter kaps�lleme
		return lastName;
	}
	public void setLastName(String lastName) {//setter kaps�lleme
		this.lastName = lastName;
	}
	
	
}
	
