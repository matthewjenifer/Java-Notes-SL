package notespackage3;

public class TheoryBasics {
    public static void main(String[] args) {
        String[][] triadFormulas = {
            {"Major", "Augmented", "Minor","Diminished","Sustained2","Sustained4","Lydian","Phrygian"},
            {"1-3 -5 ","1-3-#5 ", "1-b3-5 ","1-b3-b5","1-2 -5 ","1-4 -5 ","1-#4-5 ","1-b2-5 "}
        };

            String Maj = triadFormulas[0][0];
            String Aug = triadFormulas[0][1];
            String Min = triadFormulas[0][2];
            String Dim = triadFormulas[0][3];
            String Sus2 = triadFormulas[0][4];
            String Sus4 = triadFormulas[0][5];
            String Lyd = triadFormulas[0][6];
            String Phr = triadFormulas[0][7];
            
            String oneThreeFive = triadFormulas[1][0];
            String oneThreeSharpFive = triadFormulas[1][1];
            String oneFlatThreeFive = triadFormulas[1][2];
            String oneFlatThreeFlatFive = triadFormulas[1][3];
            String oneTwoFive = triadFormulas[1][4];
            String oneFourFive = triadFormulas[1][5];
            String oneSharpFourFive = triadFormulas[1][6];
            String oneFlatTwoFive = triadFormulas[1][7];

            System.out.println(" ");
            System.out.println("----------------");
            System.out.println("(Triad Formulas)");
            System.out.println("--------------");
            System.out.println("Chord Name: " + oneThreeFive + " | " + Maj);
            System.out.println("Chord Name: " + oneThreeSharpFive + " | " + Aug);
            System.out.println("Chord Name: " + oneFlatThreeFive + " | " + Min);
            System.out.println("Chord Name: " + oneFlatThreeFlatFive + " | " + Dim);
            System.out.println("Chord Name: " + oneTwoFive + " | " + Sus2);
            System.out.println("Chord Name: " + oneFourFive + " | " + Sus4);
            System.out.println("Chord Name: " + oneSharpFourFive + " | " + Lyd);
            System.out.println("Chord Name: " + oneFlatTwoFive + " | " + Phr);
            
            System.out.println(" ");
    }
}
