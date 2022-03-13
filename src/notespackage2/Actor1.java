package notespackage2;
public class Actor1 extends Actor { // To inherit from a class, use the extends keyword. Here, Actor1 is the subclass, and Actor is the superclass. When a class is inherited from another class, it inherits all of the superclass' non-private variables and methods. | You can access the superclass from the subclass using the super keyword.
    
    String extraRole = "Co Starring - Tommy";

    public void setCo() {
        System.out.println(extraRole);
    }

}
