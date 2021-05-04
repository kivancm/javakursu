
public class User {
private int id;//sinif disinden erisimi engelledik
private String userName;//sinif disinden erisimi engelledik
private String firstName;//sinif disinden erisimi engelledik
private String lastName;//sinif disinden erisimi engelledik
	public User() {//new'leyince constructor calisir 
	System.out.println("kullanici kaydi yapildi.");
	}
	public int getId() {//getter kapsülleme
		return id;
	}
	public void setId(int id) {//setter kapsülleme
		this.id = id;
	}
	public String getUserName() {//getter kapsülleme
		return userName;
	}
	public void setUserName(String userName) {//setter kapsülleme
		this.userName = userName;
	}
	public String getFirstName() {//getter kapsülleme
		return firstName;
	}
	public void setFirstName(String firstName) {//setter kapsülleme
		this.firstName = firstName;
	}
	public String getLastName() {//getter kapsülleme
		return lastName;
	}
	public void setLastName(String lastName) {//setter kapsülleme
		this.lastName = lastName;
	}
	
	
}
	
