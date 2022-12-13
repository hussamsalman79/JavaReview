package JavaLogics01;

import java.util.Arrays;

public class twoStringanagram {

	public static void main(String[] args) {
		
		// Anagram: compares 2 words to check if they have similar letters 
		// letter casing, location, and order is not matter 
		// Examples: Listen and silent => anagram 
		// Easy way to solve it by sorting the 2 words and compare them
		
		String str1 = "Silent"; 
		String str2 = "listen"; 
		
		// 1. covert them to array:
		
		char[] arr1 = str1.toLowerCase().toCharArray(); 
		char[] arr2 =str2.toLowerCase().toCharArray(); 
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		//2. sort them
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//3. Compare 
		
		if (Arrays.equals(arr1, arr2)) {
			
		System.out.println("We have an anagram strings");
		}
		else {
			System.out.println("We do not have an anagram strings");
		}
	
	}

}
