package JavaLogics01;

public class FindMaxNum2 {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 7, 12, 9, 11, 5 };

		// Initialize the max variable

		int max = arr[0]; // max =2

		// find the max value

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println(max);
		
		// find the second Max 
		
		// Initialize the secondMax variable
		//max =12
		int secondMax = Integer.MIN_VALUE; // 2nd=1
		 for (int i=0; i<arr.length; i++) {
			 
			 if (arr[i]>secondMax && arr[i]!=max) {
				 
				 secondMax =arr[i]; // 2nd =7
				 
			 }
			 
		 }
		System.out.println(secondMax);

	}

}
