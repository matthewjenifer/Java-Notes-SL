package notespackage3;

public class DorianMode {
    public static void main(String[] args) {
        String[] aIonian = {"A","B","C#","D","E","F#","G#", "A"}; // PARENT (Major) Scale
        String[] aMajor = {"A","B","C#","D","E","F#","G#", "A"}; // PARENT (Major) Scale
        String[] bDorian = {"B","C#","D","E","F#","G#", "A", "B"}; //B dorian is the second mode of A Major. This would work well over B Major or B Minor chords.

        // String[] cPhrygian = {"C#","D","E","F#","G#", "A", "B", "C#"}; 
        // String[] dLydian = {"D","E","F#","G#", "A", "B", "C#","D"}; 
        // String[] eMixolydian = {"E","F#","G#", "A", "B", "C#","D","E"}; 
        // String[] fAeolian = {"F#","G#", "A", "B", "C#","D","E", "F#"};  
        // String[] gLocrian = {"G#", "A", "B", "C#","D","E", "F#","G#"};  

        String rootNote = bDorian[0]; // 
            String secondDegree = aIonian[1];
    
                if(rootNote == secondDegree) {
                System.out.println("True");
                }

        String aIon2 = aIonian.toString();

        System.out.println("Your Scale Sir: " + aIon2); // Prints: Your Scale Sir: [Ljava.lang.String;@31befd9f ???? | https://replit.com/join/cjrzntlkyn-matthewjenifer







    
                // if(aIonian[2] == aMajor[2]) {
                // System.out.println("True");
                // } else {
                //   System.out.println("Nah Son");
                // }
    }
}
