package JavaLogics01;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		checkPalindrome(); 
		
	}
	public static void checkPalindrome() {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter a palindrome string: ");
			String data = scanner.next();
			String reversedData = "";
			for(int i = data.length()-1; i>=0; i--) {
				reversedData+=data.charAt(i);
			}
			if(data.equals(reversedData)) {
				System.out.println("\"" + data + "\" : is a Palindrome");
				break;
			}else {
				System.out.println("\"" + data + "\" : is not a Palindrome, Please try again");
			}
			
		}
	}
		public static void checkPalindrome(String data) {
		
		
		String reversedData  = "";
		for(int i = data.length() -1 ; i>=0 ;i--) {
			reversedData += data.charAt(i);
		}
		
		if(reversedData.equals(data)) {
			// "abcd": is a palaindrome
		
			System.out.println("\"" + data + "\" : is a Palindrome");
		}
		else {
			System.out.println("\"" + data + "\" : is not a Palindrome" );
		}
	}
}
