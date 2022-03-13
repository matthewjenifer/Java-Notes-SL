package notespackage2;

interface WaterBottleInterface { //An INTERFACE is a completely abstract class that contains only abstract methods.

    String color = "Blue";

    // Specifications for interfaces:

    // - Defined using the interface keyword.
    // - May contain only static final variables.
    // - Cannot contain a constructor because interfaces cannot be instantiated.
    // - Interfaces can extend other interfaces.
    // - A class can implement any number of interfaces.

    void emptyOut(); // interfaces are implicitly public
    public void fillUp(); // this would run the same with or without the public keyword

    // Interfaces have the following properties:

    // - An interface is implicitly abstract so you do not need to use the abstract keyword while declaring an interface.
    // - Each method in an interface is also implicitly abstract. You do not need to use the abstract keyword. 
    // - Methods in an interface are implicitly public

    // A class can inherit from just one superclass, but can implement multiple interfaces.
}


public class InterfaceExample implements WaterBottleInterface { // Use the implements keyword to use an interface with your class.
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample jug = new InterfaceExample();
        jug.fillUp();
        jug.emptyOut();
    }

    @Override // When you implement an interface, you need to override all of its methods.
    public void fillUp() {
        System.out.println("Jug Filled");
    }
    
    @Override
    public void emptyOut() {
        System.out.println("Jug Emptied");       
    }
}
