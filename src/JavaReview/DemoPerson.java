package JavaReview;

public class DemoPerson {
	
	public static void main(String[] args) {
		DemoPerson obj = new DemoPerson(); 
		Person Per1 = obj.getPerson("Sam", 43); 
		System.out.println(Per1.getName());
		System.out.println(Per1.getAge());
	}

	public Person getPerson(String name, int age) {
		Person myPerson = new Person(); 
		 myPerson.SetName(name);
		 myPerson.SetAge(age);
		return myPerson; 
		
		
	}

}
