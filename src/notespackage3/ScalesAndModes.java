package notespackage3;

public class ScalesAndModes {
    public static void main(String[] args) {

        String[] cMajor = {"C","D","E","F","G","A","B", "C"}; // (aka Ionian) POP VIBES
        // String[] dDorian = {"D","E","F","G","A","B","C","D"}; // FUNKY-DARK-SAD VIBES
        // String[] ePhrygian = {"E","F","G","A","B","C","D","E"}; // FOREBODING-MYSTERY VIBES
        // String[] fLydian = {"F","G","A","B","C","D","E","F"}; // ETHEREAL VIBES (most unstable)
        // String[] gMixolydian = {"G","A","B","C","D","E","F","G"}; // EDGY-BLUES VIBES
        String[] aAeolian = {"A","B","C","D","E","F","G", "A"}; // MINOR-ALT VIBES
        // String[] bLocrian = {"B","C","D","E","F","G", "A","B"}; //MENACE ("Army Of Me")
    
            // String[] aNatMinor = {"A","B","C","D","E","F","G", "A"};
            // String[] aHarMinor = {"A","B","C","D","E","F","G#", "A"};
            // String[] aMajor = {"A","B","C#","D","E","F#","G#", "A"};

            String rootNote = aAeolian[0]; // A is C Major's Natural Minor. This means the 6th note on C Major's scale degree[index 5], is A Aeolian (or A Nat)'s ROOT[0] note. In other words, these scales are the same - but with different centers of gravity (or "feeling") 
            String sixthdegree = cMajor[5];
    
                if(rootNote == sixthdegree) {
                System.out.println("True");
                }
    
    }
}
