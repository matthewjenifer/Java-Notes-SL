package notespackage;
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

// While JAVA provides many different methods for getting user input, the Scanner object is 
// the most common, and perhaps easiest to implement. We import the Scanner class like this:

import java.util.Scanner; // In order to use the Scanner class, create an instance of the class by using the following(***) syntax:

public class WatupDoe { //PUBLIC is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.
    
    //The following choices are available for attributes and methods:
        
    // default: A variable of method declared with no access control modifier is available to any other class in the same package.
    // public: Accessible from any other class.
    // protected: provides the same access modifier, with the addition that subclasses can access protected methods and variables of the superclass.
    // private: Accessible only within the declared class itself.
    // It's a best practice to keep the variables within a class private. The variables are accessible and modified using GETTERS and SETTERS.

	public static void main(String[] args) {
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
		double m = 6.3 * height;
		System.out.println(m); // prints: 35.91
		// / division
		int a = 6 / 3;
		System.out.println(a); // prints: 2
		// % modulo (remainder after total amount of division is accomplished)
		int b = 24 % 7;
		System.out.println(b); // prints: 3 --> 7 goes into 24 three times(21), leaving a remainder of: 3

		// INCREMENT OPERATORS
		// An increment or decrement operator provides a more convenient and compact way
		// to increase or decrease the value of a variable by one.
		// For example, the statement x=x+1; can be simplified to ++x;

		int peaceGod = 7;
		var knowledgeBorn = ++peaceGod; // PREFIX(operator precedes text): Increments the variable's value and uses the
										// new value in the expression.
		++knowledgeBorn;
		System.out.println(knowledgeBorn); // prints: 9

		int powerEquals = 5;
		String watupDoe = "...whats the science kid?";
		var refinement = powerEquals++; // POSTFIX(operator follows text): The variable's value is first used in the
										// expression and is then increased.
		System.out.println(refinement + watupDoe); // prints: 5...whats the science kid?

		// A QUICK NOTE ON EQUALS VS == :
		// https://github.com/matthewjenifer/explaining-equals-to-me

		// LOGICAL OPERATORS
		int age = 17;
		int cash = 30;
		if (cash > 5 && age > 18) {
			System.out.println("sale");
		} else {
			System.out.println("no sale bro..");
		}

		int somethingForYourTrouble = cash + 15;
		if (somethingForYourTrouble > 40 || age > 18) {
			System.out.println("..fine..take the damn beer");
		}

		// SWITCH STATEMENTS
		int station = 3; // prints: south
		switch (station) {
		case 1:
			System.out.println("north");
			break;
		case 2:
			System.out.println("east");
			break;
		case 3:
			System.out.println("south"); // - When the variable being switched on is equal to a case, the statements
											// following that case will execute until a break statement is reached.
			break; // - When a break statement is reached, the switch terminates, and the flow of
					// control jumps to the next line after the switch statement. Not every case
					// needs to contain a break. If no break appears, the flow of control will fall
					// through to subsequent cases until a break is reached.

		case 4:
			System.out.println("west");
			break;
		}

		int fingers = 5;// prints: side
		switch (fingers) {
		case 7:
			System.out.println("north");
			break;
		case 5:
			System.out.println("side");
			break;
		}

		int toes = 5;// prints: in this bitch!
		switch (toes) {
		case 1:
			System.out.println("north");
			break;
		case 2:
			System.out.println("side");
			break;
		default: // A switch statement can have an optional default case.
			// The default case can be used for performing a task when none of the cases is
			// matched.
			// No break is needed in the default case, as it is always the last statement in
			// the switch.
			System.out.println("in this bitch!");
		}

		
		//LETS BUILD A SCANNER
		Scanner fetch = new Scanner(System.in); // ***(imported at the top)
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
		
		System.out.println("Watup " + name + "! Was poppin " + letter + "?");
		System.out.println(word + " " + word);
		
		System.out.println("Hey..who are you really?");
		String name2 = fetch.next(); // accepts input from console
		System.out.println("hello "+ name2);
		System.out.println("What station is Rosenberg on "+ name2 + "?");
		double hot = fetch.nextDouble();// accepts input from console
		if(hot != 97.1) {
			System.out.println("Nope!");
		} else {
			System.out.println("thats right "+ name2 + ", " + hot + " is correct! Well done.");
		}
		
		//WHILE LOOP
		int dollars = 7;
		while(dollars < 10) {
			System.out.println(dollars);
			dollars++;
		}
		System.out.println("..which is why 6 was afraid of 7! get it? *rimshot*");

		Album debut = new Album("Illmatic", "Nasty Nas"); //This is connected to our Album Class(Album.java). And will only run if the class is in the same package: "notespackage" (see: line 1)
        System.out.println(debut.title + " featuring: " + debut.artist);

	}

}
