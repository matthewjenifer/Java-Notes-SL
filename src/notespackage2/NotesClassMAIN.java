package notespackage2; //Packages are used to avoid name conflicts and to control access to classes.
//A package can be defined as a group made up of similar types of classes, along with sub-packages.
public class NotesClassMAIN {

//public static final double pi = 3.14; // Use the final keyword to mark a variable constant, so that it can be assigned only once. PI is now a constant. Any attempt to assign it a value will cause an error. Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.

    public static void main(String[] args) { // When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects. The main method must always be static.
    //System.out.println(pi);

    Encapsulation e = new Encapsulation(); //see: Encapsulation.java
        e.setShow("Martin"); // prints: Martin
        e.setSeason(4);
    System.out.println(e.getShow());
    System.out.println("Season: " + (e.getSeason())); // prints: Season: 4

    Actor1 martin = new Actor1(); //Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order. | see: Actor.java, Actor1.java, etc

    martin.episodeNext(); // prints: Episode 88
    martin.titleCard(); // prints: Uptown Friday Night
    martin.setCo(); // prints: Co Starring - Tommy
    martin.whichChannel(); // prints: on BET
    
    Actor2 bet = new Actor2();
    
    Overload obj1 = new Overload(); // Overload obj1 = new Overload(); | The first word in your syntax has to mirror the class with the method you're called (now defined as "obj1") - see: Overload.java
    obj1.print(20); // prints: 20
    obj1.print(4.9); // prints: 4.9
    obj1.print("CGI Martin"); // prints: CGI Martin
    obj1.print(10,21); // prints: Month: 10 | Day: 21
    martin.yearRelease(); // prints: Year: 1995
    
    //BONUS example: second call on first print() method: public void print(int num)
    // obj1.print('c'); //prints: int 99 (ASCII equivalent)
    
    FlatScreen hdmi = new FlatScreen(); // Anonymous classes are a way to extend the existing classes on the fly. The modification is applicable only to the current object, and not the class itself. So if we create another object of that class, the start method's implementation will be the one defined in the class.
    
    hdmi.connect(); // prints: Device connected
    
    bet.stream(); //prints: Streaming NOW...

    
    enum Roles { // An ENUM is a special type used to define collections of constants. You should always use Enums when a variable (especially a method parameter) can only take one out of a small set of possible values. If you use Enums instead of integers (or String codes), you increase compile-time checking and avoid errors from passing in invalid constants, and you document which values are legal to use. Some examples of uses would be: month names, days of the week, deck of cards, chess pieces, etc.
        JEROME,
        TOMMY, // Note that the values are separated by comma. You can refer to the constants in the enum above with the dot syntax. Basically, Enums define variables that represent members of a fixed set.
        COLE 
    }
    
    Roles a = Roles.JEROME;

    switch(a) {
            case JEROME:
            System.out.println("...n'if I tell you a duck could pull a truck, thenshutupnhookthasuckaup");
            break;
            case TOMMY:
            System.out.println("Jerome we aint tryna be hangin wit you either man..");
            break;
            case COLE:
            System.out.println("Yeah come on Jerome we aint got all night, now look you gonna help us or what? ...");
            break;
        }

    };


}



