package notespackage;

public class Album {

    String artist;
    String title;
    String type;
    //private int mics;
    public Album(String title, String artist) { // public Album(){}; - no static, no void. no main. etc etc. | Think of constructors as methods that will set up your class by default, so you don’t need to repeat the same code every time. | Constructors are not member methods, and so are not inherited by subclasses. However, the constructor of the superclass is called when the subclass is instantiated.
        this.title = title;
        this.artist = artist;
    }

}
