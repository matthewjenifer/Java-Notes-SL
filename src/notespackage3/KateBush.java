package notespackage3;

public class KateBush { // https://www.hooktheory.com/theorytab/view/kate-bush/babooshka
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Babooshka by Kate Bush");
        String[][] babooshka = {
            {"G#mi","C#", "Eb","Ebm","C#sus24","B","Bmaj7","Bbm7","G#m7"},
            {"6","4","5","6","8","5","6","7","12"},
            {"F","Eb","E","F","G","E","F","F#","B"}
        };
        String iv = babooshka[0][0];
        String VII6 = babooshka[0][1];
        String I6 = babooshka[0][2];
        String i = babooshka[0][3];
        String VIIsus2sus4 = babooshka[0][4];
        String VI = babooshka[0][5];
        String VI7 = babooshka[0][6];
        String V7 = babooshka[0][7];
        String iv7 = babooshka[0][8];

        String mk3a = babooshka[1][0];
        String mk3b = babooshka[1][1];
        String mk3c = babooshka[1][2];
        String mk3d = babooshka[1][3];
        String mk3e = babooshka[1][4];
        String mk3f = babooshka[1][5];
        String mk3g = babooshka[1][6];
        String mk3h = babooshka[1][7];
        String mk3i = babooshka[1][8];

        String finger1 = babooshka[2][0];
        String finger2 = babooshka[2][1];
        String finger3 = babooshka[2][2];
        String finger4 = babooshka[2][3];
        String finger5 = babooshka[2][4];
        String finger6 = babooshka[2][5];
        String finger7 = babooshka[2][6];
        String finger8 = babooshka[2][7];
        String finger9 = babooshka[2][8];

        String root1 = "D#mi";
        String root2 = "Bbmi";

        String root3 = "G#mi";
        String root4 = "";

        System.out.println("-----------------");
        System.out.println("(Intro - x4)");
        System.out.println("Min3 [r]("+ root1 +"): " + " Pad-" + mk3a + " (" + iv + ")" );
        System.out.println("Min3 [r]("+ root1 +"): " + " Pad-" + mk3b + " (" + VII6 + ")" );
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + I6 + ")" );
        System.out.println("-----------------");
        System.out.println("(Verse)");
        System.out.println("Min4 [r]("+ root2 +"): "+ " Pad-" + mk3d + " (" + i + ")" );
        System.out.println("Min4 [r]("+ root3 +"): "+ " Pad-" + mk3e + " (" + VIIsus2sus4 + ")" );
        System.out.println("Min4 [r]("+ root3 +"): " + " Pad-" + mk3f + " (" + VI + ")" );
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + I6 + ")" );
        System.out.println("-----------------");
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + VI7 + ")" );
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + V7 + ")" );
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + iv7 + ")" );
        System.out.println("Min3 [r]("+ root1 +"): " + " Pad-" + mk3b + " (" + VII6 + ")" );
        System.out.println("Min3 [r]("+ root2 +"): " + " Pad-" + mk3c+ " (" + I6 + ")" );
        // System.out.println("Min4 [r]("+ root2 +"): "+ " Pad-" + mk3d + " (" + i + ")" );
        // System.out.println("Min4 [r]("+ root3 +"): "+ " Pad-" + mk3e + " (" + VIIsus2sus4 + ")" );
        // System.out.println("Min4 [r]("+ root3 +"): " + " Pad-" + mk3f + " (" + VI + ")" );
    }
}

// more fun: https://www.hooktheory.com/theorytab/view/kate-bush/wuthering-heights
// more fun: https://www.hooktheory.com/theorytab/view/paul-mccartney/maybe-im-amazed