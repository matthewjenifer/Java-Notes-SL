package notespackage2;

public class Encapsulation {  //ENCAPSULATION: There are 4 core concepts in OOP- encapsulation, inheritance, polymorphism and abstraction. 

    private String show; // The idea behind ENCAPSULATION is to ensure that implementation details are not visible to users. The various of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.
    //To achieve encapsulation in Java, declare the class' variables as private and public setter and getter methods to modify and view the variables' values.

    private int season; // This implementation hides the "season" variable, enabling access to it only though the "setSeason()" method, which validates first, before modifying the variable. 

    public void setShow(String newShow) {
        show = newShow;
    }
    
    public String getShow() {
        return show;
    }
            //To achieve encapsulation in Java, declare the class' variables as private and public setter and getter methods to modify and view the variables' values.
    public void setSeason(int newSeason) {
        season = newSeason;
    }
    
    public int getSeason() {
        return season;
    }

    //In summary, encapsulation provides the following benefits:
    // - control of the way data is accessed of modified data
    // - more flexible and easily changed code
    // - ability to change one part of the code without affecting other parts.

}
