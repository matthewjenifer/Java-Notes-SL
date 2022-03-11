package notespackage3; //Packages are used to avoid name conflicts and to control access to classes.
//A package can be defined as a group made up of similar types of classes, along with sub-packages.
public class NotesClass {

public static final double pi = 3.14; // Use the final keyword to mark a variable constant, so that it can be assigned only once. PI is now a constant. Any attempt to assign it a value will cause an error. Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.


    public static void main(String[] args) { // When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects. The main method must always be static.
    System.out.println(pi);
    }
}
