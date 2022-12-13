package JavaLogics01;

public class removeDublicates {

	public static void main(String[] args) {
		
		String str ="DDDDDeemmmaaaaaa"; 
		String noDup =""; 	
		// Output => helo
		
		for (int i=0; i<str.length(); i++) {
			
			
			char c = str.charAt(i); 
			
			// Convert the char to string, so we can use it 
			String strChar = String.valueOf(c);
			
			// Contains methods accepts String only 
			if (!(noDup.contains(strChar))) {
				
				noDup = noDup+strChar;
				
			}
		}
		
		System.out.println(noDup);
		

	}

}
