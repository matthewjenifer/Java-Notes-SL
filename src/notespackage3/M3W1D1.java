package notespackage3;

import java.util.Scanner;

public class M3W1D1 {

    public static void main(String[] args){
        // Write a Java program that display the larger of two integers
        int x = 9;
        int y = 3;

        System.out.println("The greater number between " + x + " and " + y + " is: " + (Math.max(x,y)));
        try (// Write a Java program that delivers a letter grade for a number based score between 0-90
            Scanner fetch = new Scanner(System.in)) {
                System.out.println("So what was your test score?");
                int grade = fetch.nextInt();
                if(grade > 80 && grade < 90){
                    System.out.println("Your grade is B");
                } else if(grade > 70 && grade < 80){
                    System.out.println("Your grade is C");
                } else if(grade > 55 && grade < 70){
                    System.out.println("Your grade is D");
                } else if(grade > 0 && grade < 55){
                    System.out.println("Your grade is F");
                } else {
                    System.out.println("Your got an A!");
                }

      //Write a java  program that displays "Good Morning" if time is between 5AM-11:59 | "Good Afternoon" if time is between 12 - 16 | otherwise "Hey there
    
                System.out.println("What time is it where you are -MilitaryTime-?");
                int timeInput = fetch.nextInt();
                if(timeInput > 0500 && timeInput < 1159){
                    System.out.println("Good Morning!");
                } else if(timeInput > 1200 && timeInput < 1600){
                    System.out.println("Good Afternoon..");
                } else {
                    System.out.println("Good Evening");
                }
            } 
        
            ;

    }
}

