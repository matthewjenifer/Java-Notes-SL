package notespackage2;
public class FlatScreen extends Device {

    @Override // The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden.
    void connect() {
        System.out.println("Device connected");
    }
    
}
