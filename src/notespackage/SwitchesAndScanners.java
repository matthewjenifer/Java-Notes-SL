package notespackage;

import java.util.Scanner;

public class SwitchesAndScanners {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Who are you?");
		String name = scan.next(); // accepts input from console

		System.out.println("hello "+ name); // following input accepted at line 11, system will print user generated input
		
		System.out.println("..whats the number of completion?");
		int num = scan.nextInt(); // accepts input from console
		System.out.println("...brother this better add up: 3*3= ...."+ num);
		
		if(num == 9) {
			System.out.println("Nicley done " + name + ". The number of completion IS "+ num + "!");
		} else {
			System.out.println("Tough luck " + name + ". The number of completion IS NOT " + num);
		}
	}

}
