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
		try (Scanner scanner = new Scanner(System.in)) {
			int amount = scanner.nextInt();
			int remaining = amount ;

				for(int i=0 ; i<3 ; i++){
					int payment= ((amount*10)/100);
					remaining = amount - payment ;
					amount = remaining ;
			}
			System.out.println(remaining);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
	}
		
	}
}
