
public class Main {

	public static void main(String[] args) {
		
		Instructor hoca1=new Instructor();
		hoca1.setDepartment("bilgisayar muhendisligi");
		System.out.println(hoca1.getDepartment());
		
		Instructor hoca2=new Instructor();
		hoca2.setDepartment("elektrik muhendisligi");
		System.out.println(hoca2.getDepartment());
		
		Instructor[] hocalar= {hoca1,hoca2};//dizi tanimlama
		
		Student ogrenci=new Student("2110678","java");//constructori set ettik
		System.out.println(ogrenci.getStudentNumber()+" ogrenci numarali "+ogrenci.getCourseName()+" kursu");

		InstructorManager hoca3=new InstructorManager();
		hoca3.addMultiple(hocalar);
		
		
		
		
		

	}

}
