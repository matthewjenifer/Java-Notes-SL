package notespackage2;
class Bird {
    public void sing() {
        System.out.println("It's yo thang");
    }
}
class Robin extends Bird {
    public void sing() { //Method Overriding: A subclass can define a behavior that's specific to the subclass type, meaning that a subclass can implement a parent class method based on its requirement. This feature is known as method overriding. 
        System.out.println("do what you wanna do");
    }
}
class Pelican extends Bird {
    public void sing() {
        System.out.println("I cant tell ya who to sock it to");
    }
}
public class Polymorphism { // Polymorphism, which refers to the idea of "having many forms", occurs when there is a hierarchy of classes related to each other through inheritance. A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method. Above: Robin and Pelican are classes that inherit from the Bird class. Each class has its own implementation of the makeSound() method. 

    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();
        Robin r = new Robin(); // We've created two reference variables of type Robin/Pelican, and pointed them to the Robin()/Pelican() methods. 
        Pelican p = new Pelican();
        r.sing(); // As the reference variables r & p contain the Robin/Pelican objects, after which the sing() method is called.  
        p.sing(); // This demonstrates that you can use the Bird variable without actually knowing that it contains an object of the subclass. This is very useful when you have multiple subclasses of the superclass.

        // Method overriding is also known as runtime polymorphism. 

        // Rules for Method Overriding:

        // Should have the same return type and arguments
        // The access level cannot be more restrictive than the overridden method's access level (Examples: If the superclass method is declarws public, the overriding method in the sub class can be neither private nor protected).
        // A method cannot be inherited, it cannot be overridden.
        // Constructors cannot be overridden
    }

}
