package notespackage3;

public class HowExactly {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum);
        for(int i = 1; i <= 5; i++) {
        System.out.println(i);
            if(i == 4) {
        System.out.println(i);
                continue;
            }
            sum += i;
        }
        System.out.println(sum); // prints: 11??? 
    }
}
