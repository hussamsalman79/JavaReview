package JavaReview;

public class Demo {
	
	public static void main(String[] args) {
		

		Student.name = "Sam";
		Student.age = 43; 
		
		Student.printInfo();
		
		Student Stu1 = new Student(); 
		Stu1.phoneNumber= 5713988272l; 
		Stu1.address = "22975 Worden Terr, Ashburn VA, 20148 "; 
		
		Student Stu2 = new Student(); 
		Stu2.phoneNumber= 5712752518l; 
		Stu2.address = "22999 Worden Terr, Ashburn VA, 20148 "; 
		
		
		Stu1.printStudentContact();
		System.out.println("----------------------");
		Stu2.printStudentContact();
		
		
		
		
	}

}
