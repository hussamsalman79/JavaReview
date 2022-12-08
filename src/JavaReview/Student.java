package JavaReview;

public class Student {
	
	static String name; 
	static int age; 
	static int x = 3; 
	static int y = 5; 
	
	long phoneNumber; 
	String address; 
	
	
	 static void printInfo() {
		
		System.out.println("Name of the Student: " + name);
		System.out.println("Age of the Student: " + age);
		int total = x*y; 
		System.out.println(total);
	}
	 
	void printStudentContact() {
		
		System.out.println("Cell: " + phoneNumber + " , " + "Adrress: " + address );
		
	}


}
