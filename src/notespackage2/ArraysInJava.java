package notespackage2;

import java.util.Scanner;
import java.util.ArrayList; // The Java API provides special classes to store and manipulate groups of objects. One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink. On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged. When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so its necessary to import it before using it.
import java.util.LinkedList;  
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

		// ArrayList colors = new ArrayList();
		ArrayList<String> colors = new ArrayList<String>(10); // This code defines an ArrayList of Strings with 10 as its initial size.
		colors.add("Red"); //The add() method adds new objects to the ArrayList. Conversely, the remove() method removes objects from the ArrayList.
		colors.add("Black");
		colors.add("Green"); 
		// Other useful methods include the following:
		// - contains(): Returns true if the list contains the specified element 
		// - get(int index): Returns the element at the specified index the list
		// size(): Returns the number of elements in the list
		// - clear(): Removes all elements from the list
		
		// Note: As with arrays, the indexing starts with 0

		System.out.println(colors);
		System.out.println(colors.get(1));
		System.out.println(colors.size());
		System.out.println(colors.contains("Brown"));
		System.out.println(colors.add("Yellow"));
		System.out.println(colors.contains("Yellow"));
		System.out.println(colors.size());
		colors.clear();
		System.out.println(colors.size());

		//ArrayLists store objects. Thus, the type specified must be a class type. You cannot pass, for example, int as the objects' type. Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on. 
		LinkedList<String> colors1 = new LinkedList<String>(); // The LinkedList is very similar in syntax to the ArrayList. You can easily change an ArrayList to a LinkedList by changing the object type. You cannot specify an initial capacity for the LinkedList.
		colors1.add("Earth"); 
		colors1.add("Blood");
		colors1.add("Culture");

		System.out.println(colors1);

		// LIKEDLIST VS ARRAYLISTS 

		// The most notable difference between the LinkedList and the ArrayList is in the way they store objects. The ArrayList is better for storing and accessing data, as it is very similar to a normal array. The LinkedList is better for manipulating data, such as making numerous inserts and deletes. - In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element. 

		// - Use an ArrayList when you need rapid access to data.
		// - Use a LinkedList when you need to make a large number of inserts and/or deletes.

	}

}
