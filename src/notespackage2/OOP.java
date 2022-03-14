package notespackage2;

public class OOP {
    //OBJECT ORIENTATION: Java uses object orientated programming, in attempt to make thinking about programming closer to thinking about the real world. In OOP, each object is an independent unit with a unique identity, just as objects in the real world are. Objects also have characteristics, which are used to describe them.  For example, a car can be blue or red, a mug can be empty or full, etc etc. These characteristics are also called attributes. An attribute describes the current state of an object. In the real world, each object behaves its own way. The car moves, the phone rings, and so on. The same applies to objects: behavior is specific to the object's type. 

    //In short: each object has three dimensions: identity, attributes, and behavior. The identity
    
    //CLASSES: A class describes what the object will be, but is separate from the object itself. In other words, classes can be described as blueprints, descriptions for an object. You can use the same class as a blueprint for creating multiple objects. The first step is to define the class, which then becomes a blueprint for object creation. Each class has a name, and each is used to define attributes and behavior.

    public static void main(String[ ] args) { // This -- public static void main(String[ ] args) -- indicates that the main method takes an array of Strings as its parameters, and does not return a value.
        doSomething(4);

        int x = 10;
        int y = myFunc(x); //y is assigned: 30
        System.out.println(y); //prints: 30

        //CREATING OBJECTS
        // Animal dog = new Animal(); // Dog is an object of type Animal. Thus we can call its bark() method, using the name of the object and a dot. The dot notation is used to access the object's attributes and methods.
        // dog.bark();
    }

static void doSomething(int x) {
    System.out.println(x*x);  //prints: 16
}
public static int myFunc(int x) {
    return x*3; // 10*3
}  
}    



