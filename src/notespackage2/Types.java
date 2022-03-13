package notespackage2;

public class Types { // Assigning a value of one type to a variable of another type is known as Type Casting.
    public static void main(String[] args) {

        int a = (int) 3.14; // To cast a value to a specific type, place the type in parentheses and position it in front of the value.
        System.out.println(a); // The code above is casting the value 3.14 to an integer, with 3 as the resulting value.

        double b = 42.571;
        int c = (int) b;
        System.out.println(c);

        // JAVA supports automatic type casting of integers to floating points, since there is no loss of precision. On the other hand, type casting is mandatory when assigning floating point values to integer variables.

        // For classes there are two types of casting: Upcasting is casting an instance of a subclass to its superclass. Casting an object of a superclass to its subclass is called downcasting.

        // Why is upcasting automatic, downcasting manual? Well, upcasting can never fail. But if you have a group of different Animals and want to downcast them all to a Cat, then there's a chance that some of these Animals are actually Dogs, so the process fails.
        
        
    }
}
    
