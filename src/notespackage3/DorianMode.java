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
                System.out.println("Dorian Mode Gravity Center: " + rootNote);
                }

        System.out.println("---------");

        String aIon2 = String.join(" ", aIonian);
        System.out.println("A Ionian: " + aIon2);
        String aMaj = String.join(" ", aMajor);
        System.out.println("A major: " + aMaj);
        
        System.out.println("---------");

        if(aMaj == aIon2){
        System.out.println("Your Scale Sir: " + aIon2);
        } else {
            System.out.println("ah ah ah..you didnt say the magic word!");
        }

        System.out.println("---------");







    
        if(aIonian[2] == aMajor[2]) {
        System.out.println("True");
        } else {
        System.out.println("Nah Son");
        }







    }
}
