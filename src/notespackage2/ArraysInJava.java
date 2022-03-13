package notespackage2;

import java.util.Scanner;
public class ArraysInJava {

	public static void main(String[] args) {
		// An array is a collection of variables of the same type. When you need to store a list of values, such as numbers, you can store them in an array, instead of declaring separate variables for each number. To declare an array you need to define the type of elements with square brackets. 
		
		// For example, an array of integers:
		// int[] arr; -- the name of the array is arr. int is the type of elements this array will hold. 
		// The following line of code will define the array's capacity, or the number of elements in said array. This is accomplished using the keyword: new.
		int[] arr = new int[5]; // This array will be ordered according to the index. ex: 0,1,2,3,4
		arr[2] = 42; // This assigns a value of 42 to the element with 2 as its index.

		//INITIALIZING ARRAYS
		String[] kubrick = {"2001","Eyes Wide Shut","Clockwork Orange"};
		System.out.println(kubrick[1]); //Prints: Eyes Wide Shut

		//ENHANCED FOR LOOP 
		String[] hiphophoor = {"aay","ho","hey","hoe"};
		for(String x: hiphophoor) {
			System.out.println(x); //The enhanced for loop declares a variable of a type compatible with the elements of the array being accessed. The variable will be available within the for block, and its value will be the same as the current array element.
			// So, on each iteration of the loop, the variable "x" will be equal to the corresponding element in the array.
		}

		int[] micCheck = {1,2,1,2};
		for(int y: micCheck) {
			System.out.println(y); //The enhanced for loop declares a variable of a type compatible with the elements of the array being accessed. The variable will be available within the for block, and its value will be the same as the current array element.
			// So, on each iteration of the loop, the variable "y" will be equal to the corresponding element in the array.
		}

		//MULTI-DIMENSIONAL ARRAYS: or arrays that contain other arrays. 
		int[][] waltz = {{1,2,3},{4,5,6}};
		int z = waltz[1][2]; 
		int a = waltz[0][2]; //The array's two indexes are called row index and column index.
		int b = waltz[0][1]; 
		int c = waltz[1][0]; 
		int d = waltz[1][1]; 
		int e = waltz[0][0]; 
		System.out.println(z); //prints: 6
		System.out.println(a); //prints: 3 (see: row index and column index.)
		System.out.println(b); //prints: 2
		System.out.println(c); //prints: 4
		System.out.println(d); //prints: 5
		System.out.println(e); //prints: 1

		int res = 0;
		for(int el:arr){
			res += el;
		}
		System.out.println(res); //prints: 42 (see: top)

		System.out.println("Input String for me to Reverse:"); //PROMPT

		try (Scanner scanner = new Scanner(System.in)) {
			String text = scanner.nextLine(); //takes input..waits to execute the next few lines
			char[] arr2 = text.toCharArray();
			
			String rev = ""; 
			for (char i : arr2)
			rev = i + rev;
			System.out.println(rev);
		}

	}

}
