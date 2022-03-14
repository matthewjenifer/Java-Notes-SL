package notespackage3;

import java.util.Scanner;
public class LoanCalculator {

	// LOAN CALCULATOR
	
// You take a loan from a friend and need to calculate how much you will owe him after 3 months.
// You are going to pay him back 10% of the remaining loan amount each month.
// Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
	
//Sample Input:
//20000
	
//Here is the monthly payment schedule:
	
//Month 1
//Payment: 10% of 20000 = 2000
//Remaining amount: 18000
	
//Month 2
//Payment: 10% of 18000 = 1800
//Remaining amount: 16200
	
//Month 3:
//Payment: 10% of 16200 = 1620
//Remaining amount: 14580

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) { // Exceptions can be caught using a combination of the try and catch keywords. A try/catch block is places around the code that might generate an exception.
			int amount = scanner.nextInt();
			int remaining = amount ;

				for(int i=0 ; i<3 ; i++){
					int payment= ((amount*10)/100);
					remaining = amount - payment ;
					amount = remaining ;
			}
			System.out.println(remaining);
		} catch (Exception e) { // EXCEPTIONS
			// A catch statement involves declaring the type of exception you are trying to catch. If an exception occurs in the try block, the catch block that follows the try is checked. If the exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter. The Exception type can be used to catch all possible exceptions.
			System.out.println("Something went wrong.");
			// An exception is a problem is a problem that occurs during program execution. Exceptions cause abnormal termination of the program. Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

			//An exception can occur for many different reasons. Some examples:

			//- A user has entered invalid data.
			//- A file that needs to be opened cannot be found.
			//- A network connection has been lost in the middle of communications.
			//- Insufficient memory and other issues related to physical resources.
	}
		
	}
}
