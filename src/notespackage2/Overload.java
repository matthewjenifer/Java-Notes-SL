package notespackage2;

public class Overload { // Another name for method overloading is compile-time polymorphism. (see: Polymorphism.java)
    public void print(int num){ // When methods have the same name but different parameters, it is known as method overloading.
        System.out.println("Episodes to go:");
        System.out.println("queue: " + num);
    }
    public void print(double num){ 
        System.out.println("Goggle rating:");
        System.out.println("popularity: " + num);
    }
    public void print(String text){ // This can be very useful when you need the same method functionality for different types of parameters.
        System.out.println("Intro Version - ");
        System.out.println("Theme Opening: " + text);
    }
    public void print(int num1, int num2){ // An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.
        System.out.println("Premiere Date ");
        System.out.println( "Month: " + num1 + " | Day: " + num2);
    }
}