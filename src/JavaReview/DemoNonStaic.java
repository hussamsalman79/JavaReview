package JavaReview;

public class DemoNonStaic {

	public static void main(String[] args) {
		
		StudentNonStatic student1 = new StudentNonStatic(); 
		
		student1.name = "Sam Karmah"; 
		student1.age = 44; 
		
		String StuInfo=student1.StudentInforamtion(); 
		System.out.println(StuInfo);
		
		StudentNonStatic.Course ="SDET"; 
		StudentNonStatic.SchoolName ="Prime Tech School"; 
		
		String SchoolInfo	= StudentNonStatic.SchoolInfo();
		System.out.println(SchoolInfo);

	}

}
