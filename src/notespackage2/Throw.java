package notespackage2;

public class Throw {
    int a = 12;
    int b = 5;
    void divide() {
        if(b==5){
            throw new ArithmeticException("ERROR MESSAGE: Cannot divide by 5"); // The throw keyword allows you to manually generate exceptions from your methods. Some of the numerous available exception types include the IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException, and so on. The throws statement in the method definition defines the type of Exception(s) the method can throw. | Multiple exceptions can be defined in the throws statement using a comma-separated list.
        } else {
        int res = a/b;
        System.out.println(res);
        }
    }
    
    public static void main(String[] args) {
        Throw t = new Throw();
        try{
            t.divide();
        } catch(ArithmeticException e) { // A single try block can contain multiple catch blocks that handle different exceptions separately.
            System.out.println(e);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
