package JavaReview;

public class CustomeMethod {

	public static void main(String[] args) {

		CustomeMethod obj = new CustomeMethod();

		obj.printHelloWorld();
		obj.mathOperation(5, 10);
		obj.getSum(100, 100);
		obj.printMessage("Husam Karmah");
		obj.revString("I love Java");
		
		
	}

	public void printHelloWorld() {

		System.out.println("Hello World");
	}

	public void mathOperation(int x, int y) {
		int total;
		total = x * y;
		System.out.println(total);
	}

	public void getSum(int x, int y) {
		int total1;
		total1 = x + y;
		System.out.println(total1);
	}
	public void printMessage(String msg) {
		
		System.out.println(msg);
	}
	public String revString (String str) {
		
		String revStr = ""; 
		
		for (int i=str.length()-1; i>=0; i--) {
			
			revStr = revStr + str.charAt(i); 
		
		}
		
		System.out.println(revStr);
		return str;
		
		
		
		
	}

	
}
