package JavaReview;

public class StudentNonStatic {
	// non static variables which they need an object to be called outside of its class
	String name; 
	int  age; 
	// Static variable which they need the class name to be called outside of its original class
	 static String Course; 
	 static String SchoolName;
	
	// non static method which they need an object to be called 
	 String StudentInforamtion() {
		
		String StudentInfo = "Name: " + name + " , " + "Age: " + age; 
		return StudentInfo;
		
	}
	// Static method which it needs the class name to be called outside of its original class
	 static String SchoolInfo() {
		
		 String CourseSchoolInfo = "School: " + SchoolName  + " , " + "Course: " + Course;
		 return CourseSchoolInfo; 
	}
	
	
}

