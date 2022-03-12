package notespackage2;

public class Overload {
    public void print(int num){
        System.out.println("Episodes to go:");
        System.out.println("queue: " + num);
    }
    public void print(double num){
        System.out.println("Goggle rating:");
        System.out.println("popularity: " + num);
    }
    public void print(String text){
        System.out.println("Intro Version - ");
        System.out.println("Theme Opening: " + text);
    }
    public void print(int num1, int num2){
        System.out.println("Premiere Date ");
        System.out.println( "Month: " + num1 + " | Day: " + num2);
    }
}