
public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getDepartment()+" bolumu eklendi");
	}
	public void addMultiple(Instructor[] instructors) {//Instructor tipinde dizi tanimladik
		for(Instructor instructor:instructors) {//foreach ile dizinin herbir elamani icin add metodunu cagirdik 
			add(instructor);//yani metod icinde metot cagirdik
		}
	}
}
