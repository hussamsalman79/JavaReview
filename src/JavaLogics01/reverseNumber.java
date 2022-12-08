package JavaLogics01;

public class reverseNumber {

	public static void main(String[] args) {
		checkPalindrome(1221); 
		checkPalindrome(7655); 
	}
	public static void checkPalindrome(int number) {
		/*
		 * num = 7655
		 * 5567 % 10 = 7     5567 / 10 = 556.7=> 556
		 * 556  % 10 = 6	 556 / 10 =55.6 => 55
		 * 55 % 10 = 5		 55 / 10 = 5.5 => 5
		 * 5 % 10 = 5		 5 / 10 = 0.2 => 0
		 * 
		 * 0 * 10 + 7 = 0 + 7 = 7
		 * 7 * 10 + 6 = 70 + 6 = 76
		 * 76 * 10 + 5 = 760 + 5 = 765
		 * 765 * 10 + 5 = 7650 + 5 = 7655
		 * 
		 */
		int copy = number;
		int reversedNum = 0;
		int remainder = 0;
		while(copy >0) {
			remainder = copy % 10;
			reversedNum = reversedNum * 10 + remainder;
			copy = copy / 10;
		}
		
		if(reversedNum == number) {
			System.out.println("Number: " + number + " ==> is a Palindrome Number");
		}
		else {
			System.out.println("Number: " + number + " ==> is not a Palindrome Number");
		}
		
	}
}
