package notespackage3;

public class Scales {
    public static void main(String[] args) {
        String[] aAeoliMode = {"A","B","C","D","E","F","G", "A"};
        // String[] bLocrian = {"B","C","D","E","F","G", "A","B"};
        String[] cMajor = {"C","D","E","F","G","A","B", "C"};
        // String[] dDorian = {"D","E","F","G","A","B","C","D"};
        // String[] dPhrygian = {"E","F","G","A","B","C","D","E"};
        // String[] fLydian = {"F","G","A","B","C","D","E","F"};
        // String[] gMixolydian = {"G","A","B","C","D","E","F","G"};
    
        String[] aNatMinor = {"A","B","C","D","E","F","G", "A"};
        // String[] aHarMinor = {"A","B","C","D","E","F","G#", "A"};
        // String[] aMajor = {"A","B","C#","D","E","F#","G#", "A"};

        String rootNote = aAeoliMode[0]; // A is C Major's Natural Minor. This means the 6th note on C Major's scale degree, is A Aeolian (or A Nat)'s ROOT note. In other words, these scales are the same - but with different centers of gravity (or "feeling") 
        String sixthdegree = cMajor[5];
    
        if(rootNote == sixthdegree) {
        System.out.println("True");
        }
    
    }
}
