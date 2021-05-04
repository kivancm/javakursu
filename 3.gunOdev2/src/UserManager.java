
public class UserManager {
	public void add(User user) {
	 System.out.println(user.getUserName()+" kullanici adi");
	}
	public void add(User[] users) {// User tipinde dizi tanimladik 
		for(User user:users) {//foreach ile dizinin her elamani icin add metodunu cagirdik  
			add(user);//yani metot icinde metot cagirdik
		}
	}
}
