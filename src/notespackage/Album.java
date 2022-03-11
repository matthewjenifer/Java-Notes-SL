package notespackage;

public class Album {

    String artist;
    String title;
    String type;
    //private int mics;
    public Album(String title, String artist) { // public Album(){}; - no static, no void. no main. etc etc. | Think of constructors as methods that will set up your class by default, so you don’t need to repeat the same code every time 
        this.title = title;
        this.artist = artist;
    }

}
