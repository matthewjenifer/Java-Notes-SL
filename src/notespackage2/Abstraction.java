package notespackage2;

public class Abstraction { //ABSTRACTION: Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementing details. A good example is a book. When you hear about a book, you dont know certain specifics, such as the page count, the color, or the size, but you understand the idea - or abstraction - of a book. The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example. 
    
    //In JAVA, abstraction is achieved using abstract classes and interfaces. An abstract class is defined using the abstract keyword. 

    // -If a class is declared abstract it cannot be instantiated (you cannot create objects of that type). 
    // -To use an abstract class, you have to inherit it from another class. 
    // - Any class that contains an abstract method should be defined as abstract.

    // An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon). ex: abstract void walk()

    // abstract class Animal {
    //     int legs = 0;
    //     abstract void makeSound();
    // }

    // class Cat extends Animal {
    //     public void makeSound() {
    //         System.out.println("Meow");
    //     }
    // }
    
}
