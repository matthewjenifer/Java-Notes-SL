package notespackage3;

public class FunctionalHarmony {
    public static void main(String[] args) {
        String[][] progression = {
            {"C","Dm","Em","F","G","Am","Bo", "D","E"},
            {"I","ii","iii","IV","V","vi","vii","V/V","V/vi"}
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

        String chord1 = progression[1][0];
        String chord2 = progression[1][1];
        String chord3 = progression[1][2];
        String chord4 = progression[1][3];
        String chord5 = progression[1][4];
        String chord6 = progression[1][5];
        String chord7 = progression[1][6];
        String chord8 = progression[1][7];
        String chord9 = progression[1][8];

        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("(C Progression)");
        System.out.println("--------------");
        System.out.println("T - Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println("SD- Chord: " + dMin +" (" + chord2 + ")");
        System.out.println("T - Chord: " + eMin +" (" + chord3 + ")");
        System.out.println("SD- Chord: " + fMaj +" (" + chord4 + ")");
        System.out.println("D - Chord: " + gMaj +" (" + chord5 + ")");
        System.out.println("SD- Chord: " + aMin +" (" + chord6 + ")");
        System.out.println("D - Chord: " + bDim +" (" + chord7 + ")");
        System.out.println("T - Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println(" ");
        System.out.println("-----------------");
        System.out.println("(TONIC Chords a.k.a \"Home\" or \"Root\")");
        System.out.println(" ");
        System.out.println("T- (" + chord1 + ") " + cMaj);
        System.out.println("T- (" + chord3 + ") " + eMin);
        System.out.println(" ");
        System.out.println("----from TONIC we can go SUB or DOM..");
        System.out.println("----------------");
        System.out.println("(SUB or PRE-DOMINANT Chords)");
        System.out.println(" ");
        System.out.println("SD- (" + chord2 + ") " + dMin);
        System.out.println("SD- (" + chord4 + ") " + fMaj);
        System.out.println("SD- (" + chord6 + ") " + aMin);
        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("(DOMINANT Chords)");
        System.out.println(" ");
        System.out.println("D- (" + chord5 + ") " + gMaj);
        System.out.println("D- (" + chord7 + ") " + bDim);
        System.out.println(" ");
        System.out.println("----DOM chords usually resolve to TONIC..");
        System.out.println("----------------");
        System.out.println(" ");
        System.out.println("(SECONDARY Dominant Chords)");
        System.out.println(" ");
        System.out.println("--think of 2ndDom chords like \"5 of 5\"(V/V)");
        System.out.println(" ");
        System.out.println("--or if G is 5deg from C, & D is 5deg from G:");
        System.out.println("then D is the 2ndDOM of C..");
        System.out.println(" ");
        System.out.println("----------");
        System.out.println("Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println("Chord: " + fMaj +" (" + chord4 + ")");
        System.out.println("Chord: " + dMaj +" (" + chord8 + ") <--2nd Dominant");
        System.out.println("Chord: " + gMaj +" (" + chord5 + ")");
        System.out.println("Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println("----------");
        System.out.println(" ");
        System.out.println("--OR: if Amin is 6deg from C, & E is 5deg from Amin:");
        System.out.println("then E(V/vi) becomes 2ndDOM of C..");
        System.out.println(" ");
        System.out.println("----------");
        System.out.println("Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println("Chord: " + eMaj +" (" + chord9 + ") <--2nd Dominant");
        System.out.println("Chord: " + aMin +" (" + chord6 + ")");
        System.out.println("Chord: " + gMaj +" (" + chord5 + ")");
        System.out.println("Chord: " + cMaj +" (" + chord1 + ")");
        System.out.println("----------------");

    }
}
