package JavaReview;

import java.util.ArrayList;
import java.util.List;

public class methodPractice {
	public static void main(String[] args) {
		
		methodPractice obj = new methodPractice(); 
		
		List <Integer> myList = obj.numberList(); 
		List<Integer> myList2 = obj.numberList2(10, 30); 
		
		System.out.println(myList);
		System.out.println(myList2);
		
	}
	
	public List <Integer> numberList() {
		
	    ArrayList<Integer> Numbers = new ArrayList<Integer>();
	    
	    for(int i =0; i<=10;i++) {
			Numbers.add(i);
		}
	    
		return Numbers;

	}
	
	public List <Integer> numberList2(int from, int to){
		
		ArrayList<Integer> Numbers2 = new ArrayList<Integer>();
		for(int i =from; i<=to;i++) {
			Numbers2.add(i);
		}
		return Numbers2;
	}
	
}
