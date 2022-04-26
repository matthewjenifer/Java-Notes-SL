package notespackage3;

// https://www.pianoscales.org/jazz.html

public class ScalesAndModes { // Musical modes are scales derived from a parent scale. There are seven music modes.Each mode is a slight variation of a scale. They use all the same notes and interval patterns as the parent scale.The main difference is the root note used to build the scale. Starting a scale on a different note defines the tonal center, giving it distinct melodic characteristics.
    public static void main(String[] args) {
        
        String[] cMajor = {"C","D","E","F","G","A","B", "C"}; // 1st degree: (aka Ionian) POP VIBES
        // String[] dDorian = {"D","E","F","G","A","B","C","D"}; // 2nd degree:  FUNKY-DARK-SAD VIBES
        // String[] ePhrygian = {"E","F","G","A","B","C","D","E"}; // 3rd degree:  FOREBODING-MYSTERY VIBES
        // String[] fLydian = {"F","G","A","B","C","D","E","F"}; // 4th degree:  ETHEREAL VIBES (most unstable)
        // String[] gMixolydian = {"G","A","B","C","D","E","F","G"}; // 5th degree:  EDGY-BLUES VIBES
        String[] aAeolian = {"A","B","C","D","E","F","G", "A"}; // 6th degree: (aka "aNatMinor") ALT VIBES
        // String[] bLocrian = {"B","C","D","E","F","G", "A","B"}; // 7th degree: MENACE ("Army Of Me") | 8 degrees is an Octave.
        
        String rootNote = aAeolian[0]; // A is C Major's Natural Minor. This means the 6th note on C Major's scale degree[index 5], is A Aeolian (or A Nat)'s ROOT[0] note. In other words, this scale and mode share the same notes - but with different centers of gravity (or "feeling") 
        String sixthdegree = cMajor[5];
        
        if(rootNote == sixthdegree) {
            System.out.println("True");
        }
        
                // String[] aNatMinor = {"A","B","C","D","E","F","G", "A"};
                // String[] aHarMinor = {"A","B","C","D","E","F","G#", "A"};
                // String[] aMajor = {"A","B","C#","D","E","F#","G#", "A"};
        
    }
}
