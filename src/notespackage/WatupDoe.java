package notespackage;

// While JAVA provides many different methods for getting user input, the Scanner object is 
// the most common, and perhaps easiest to implement. We import the Scanner class like this:

import java.util.Scanner; // In order to use the Scanner class, create an instance of the class by using the following(***) syntax:

public class WatupDoe {

	public static void main(String[] args) {

		// JAVA is a high level, modern programming language designed in the early 1990s
		// by Sun Micro-systems, and currently owned by Oracle.

		// JAVA is PLATFORM INDEPENDENT which means that you only need to write the
		// program once to be able to run it on a number of different platforms. JAVA is
		// portable, robust and dynamic, with the ability to fit the needs of virtually
		// any type of application.

		// More than 3 billion devices run JAVA. JAVA is used to develop apps for
		// Android OS, various Desktop Applications, such as media players, antivirus
		// programs, Web Applications, Enterprise Applications (ie: banking) and many
		// more!

		// In JAVA, every line of code that can actually run needs to be inside a class.
		// Each application has an entry point, or a starting point, which is a method
		// called main.

		// ALL JAVA PROGRAMS begin with this main function:

		// " public static void main(String[] args) "

		// public: anyone can access it
		// static: method can be run without creating an instance of the class
		// containing the main method
		// void: method doesn't return any value
		// main: the name of the method

		// Variables in JAVA have five types:

		int number = 5;
		double height = 5.7;
		String name = "Sah";
		char letter = 'B';
		boolean word = true;

		Scanner myScanner = new Scanner(System.in); // ***(imported at the top)
		// You can now read in different kinds of input data that the user enters.
		// Here are some methods that are available through the Scanner class:
		// Read a byte - nextByte()
		// Read a short - nextShort()
		// Read an int - nextInt()
		// Read a long - nextLong()
		// Read a float - nextFloat()
		// Read a double - nextDouble()
		// Read a boolean - nextBoolean()
		// Read a complete line - nextLine()
		// Read a word - next()

		// ???? System.out.println(myScanner.nextInt());

		System.out.println("Watup " + name + "! Was poppin " + letter + "?");
		System.out.println(word + " " + word);

		// In JAVA operands function similar to JAVASCRIPT

		// Arithmetic operators:
		// + addition
		int x = 6 + 3;
		System.out.println(x); // prints: 9
		// - subtraction
		int y = 6 - 3;
		System.out.println(y); // prints: 3
		// * multiplication
		double z = 6.3 * 3.6;
		System.out.println(z); // prints: 22.68
		// / division
		int a = 6 / 3;
		System.out.println(a); // prints: 2
		// % modulo (remainder after total amount of division is accomplished)
		int b = 24 % 7;
		System.out.println(b); // prints: 3 --> 7 goes into 24 three times(21), leaving a remainder of: 3
		
		// INCREMENT OPERATORS
		// An increment or decrement operator provides a more convenient and compact way to increase or decrease the value of a variable by one.
		// For example, the statement x=x+1; can be simplified to ++x;
			
		int peaceGod = 7;
		var knowledgeBorn = ++peaceGod; //PREFIX(operator precedes text): Increments the variable's value and uses the new value in the expression.	
		++knowledgeBorn;
		System.out.println(knowledgeBorn); // prints: 9
			
		int powerEquals = 5;
		var refinement = powerEquals++; //POSTFIX(operator follows text): The variable's value is first used in the expression and is then increased.	
		System.out.println(refinement); // prints: 5
	}

}
