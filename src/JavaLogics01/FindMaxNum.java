package JavaLogics01;

public class FindMaxNum {

	public static void main(String[] args) {

		// Find Max and second Max:
		// {2,1,3,5,4} , {1,44,55,211, 33}

		int[] arr = { 99, -1, 0, -201, 131, 311, 8871, 9098 };
		int max =0; 
		int secondMax = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max; // 2ndMax =3
				max = arr[i]; // max =5

			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("Max number is: " + max);
		System.out.println("Second Max number is: " + secondMax);

	}

}
