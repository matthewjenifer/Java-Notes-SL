package notespackage3;

public class FunctionalHarmony {
    public static void main(String[] args) {
            String[][] progression = {
                { "C", "Dm", "Em", "F", "G", "Am", "Bo", "D", "E" },
                { "I", "ii", "iii", "IV", "V", "vi", "vii", "V/V", "V/vi" }
            };
            String cMaj = progression[0][0];
            String dMin = progression[0][1];
            String eMin = progression[0][2];
            String fMaj = progression[0][3];
            String gMaj = progression[0][4];
            String aMin = progression[0][5];
            String bDim = progression[0][6];
        
            String dMaj = progression[0][7];
            String eMaj = progression[0][8];
        
            String I = progression[1][0];
            String ii = progression[1][1];
            String iii = progression[1][2];
            String IV = progression[1][3];
            String V = progression[1][4];
            String vi = progression[1][5];
            String vii = progression[1][6];
        
            String V_V = progression[1][7];
            String V_vi = progression[1][8];
        
            System.out.println(" ");
            System.out.println("----------------");
            System.out.println("(C Progression)");
            System.out.println("--------------");
            System.out.println("T - Chord: " + cMaj + " (" + I + ")");
            System.out.println("PD- Chord: " + dMin + " (" + ii + ") <-- Minor = Lowercase");
            System.out.println("T - Chord: " + eMin + " (" + iii + ")");
            System.out.println("PD- Chord: " + fMaj + " (" + IV + ")");
            System.out.println("D - Chord: " + gMaj + " (" + V + ") <-- Major = Uppercase");
            System.out.println("PD- Chord: " + aMin + " (" + vi + ")");
            System.out.println("D - Chord: " + bDim + " (" + vii + ")");
            System.out.println(" ");
        
            System.out.println("-----------------");
            System.out.println("(TONIC Chords a.k.a \"Home\" or \"Root\")");
            System.out.println(" ");
            System.out.println("T- (" + I + ") " + cMaj);
            System.out.println("T- (" + iii + ") " + eMin);
            System.out.println(" ");
            System.out.println("----from TONIC we can go PRE or DOM..");
            System.out.println("----------------");
        
            System.out.println("(PRE-DOMINANT Chords)");
            System.out.println(" ");
            System.out.println("PD- (" + ii + ") " + dMin);
            System.out.println("PD- (" + IV + ") " + fMaj);
            System.out.println("PD- (" + vi + ") " + aMin);
            System.out.println(" ");
            System.out.println("----------------");
        
            System.out.println("(DOMINANT Chords)");
            System.out.println(" ");
            System.out.println("D- (" + V + ") " + gMaj);
            System.out.println("D- (" + vii + ") " + bDim);
            System.out.println(" ");
            System.out.println("----DOM chords usually resolve to TONIC..");
            System.out.println("----------------");
            System.out.println(" ");
        
            System.out.println("(SECONDARY Dominant Chords)");
            System.out.println(" ");
            System.out.println("--think of 2ndDom chords like \"5 of ..\"(V_..)");
            System.out.println(" ");
            System.out.println("--or if G is 5deg from C, & D is 5deg from G:");
            System.out.println("then D(V/V) is the 2ndDOM of C..");
            System.out.println(" ");
            System.out.println("----------");
            System.out.println("Chord: " + cMaj + " (" + I + ")");
            System.out.println("Chord: " + fMaj + " (" + IV + ")");
            System.out.println("Chord: " + dMaj + " (" + V_V + ") <--2nd Dominant");
            System.out.println("Chord: " + gMaj + " (" + V + ")");
            System.out.println("Chord: " + cMaj + " (" + I + ")");
            System.out.println("----------");
            System.out.println(" ");
            System.out.println("--OR: if Amin is 6deg from C, & E is 5deg from Amin:");
            System.out.println("then E(V/vi) becomes 2ndDOM of C..");
            System.out.println(" ");
            System.out.println("----------");
            System.out.println("Chord: " + cMaj + " (" + I + ")");
            System.out.println("Chord: " + eMaj + " (" + V_vi + ") <--2nd Dominant");
            System.out.println("Chord: " + aMin + " (" + vi + ")");
            System.out.println("Chord: " + gMaj + " (" + V + ")");
            System.out.println("Chord: " + cMaj + " (" + I + ")");
            System.out.println("----------------");

    }
}
