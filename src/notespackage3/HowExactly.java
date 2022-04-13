package notespackage3;

public class HowExactly {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            if(i == 4) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum); // prints: 11???
    }
}
