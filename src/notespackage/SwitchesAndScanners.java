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
		System.out.println("lets see..: 3*3= ...."+ num);
		
		if(num == 9) {
			System.out.println("Nicley done " + name + ". The number of completion IS "+ num + "!");
		} else {
			System.out.println("**BUZZER** Tough luck " + name + ". The number of completion IS NOT " + num);
		}
		
		String pluginChoice = "flute"; // choose: "flute","drums", "bass"
		String recommendation = getRecommendation(pluginChoice);
		System.out.println("Recommended plug-in: " + recommendation);
	}
	
	private static String getRecommendation(String pluginChoice) {
		String plugin ="";
		switch(pluginChoice) {
			case "drums" : plugin = "Linn LM1";
			break;
			case "bass" : plugin = "EZbass";
			break;
			default: plugin = "Serato"; // The default case can be used for performing a task when none of the cases is
			// matched.
			// No break is needed in the default case, as it is always the last statement in
			// the switch.
		}
		return plugin;
		
	}

}
