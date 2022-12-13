package JavaLogics01;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDublicates2 {
	
	public static void main(String[] args) {
		
		String str = "aaaaaabbbbbbbcccccddddddeeee"; 
		String noDup=""; 
		// Converting the string to Char array 
		char [] arr = str.toCharArray(); 
		
		// LinkHashSet method does not accept duplicates and keeps chars in order b
		Set<Character> set = new LinkedHashSet<Character>(); 
		
		for (char c : arr) {
			
			set.add(c); 
			
		}
		 for (Character c:set) {
			 noDup=noDup+c; 
		 }
		
		
		System.out.println(noDup);
		
	}

}
