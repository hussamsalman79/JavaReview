package JavaLogics01;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		reverseWords("I Love Java"); 
		reverseWords("My Name is Husam"); 
		reverseWords("I,am,SDET",","); 
	}
	
	public static void reverseWords(String words) {
		// Step 1: split the word based on String pattren " "
		String [] arr = words.split(" "); 
		
		// Create empty String to add the words to it 
		
		String revString =""; 
		
		// Step 2: iterate through the words array in reverse order 
		for (int i=arr.length-1; i>=0; i--) {
			revString = revString + arr[i] + " "; 
			
		// To add the space between the words
			
			if(i!=0) {
				revString = revString + ""; 
			}
			
		}
		// print it 
		System.out.println(revString);
		
	}
	
	public static void reverseWords(String words, String regex ) {
		String revString =""; 
		String [] arr = words.split(regex); 
		for (int i=arr.length-1; i>=0; i--) {
			revString = revString + arr[i] + " "; 
			
		// To add the space between the words
			
			if(i!=0) {
				revString = revString + regex; 
			}
			
		}
		// print it 
		System.out.println(revString);
		
	}

}
