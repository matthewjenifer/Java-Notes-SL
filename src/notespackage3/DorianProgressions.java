package notespackage3;

public class DorianProgressions {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("(1) Mad World:");
        String[][] tears4fears = { { "Fm", "Ab", "Eb", "Bb" }, { "1", "6", "8", "9" } };
        String a = tears4fears[0][0];
        String b = tears4fears[0][1];
        String c = tears4fears[0][2];
        String d = tears4fears[0][3];
        String e = tears4fears[1][0];
        String f = tears4fears[1][1];
        String g = tears4fears[1][2];
        String h = tears4fears[1][3];
        System.out.println("-----------------");
        System.out.println("Min1 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Min1 " + "(" + b + "):" + " Pad-" + f);
        System.out.println("Min1 " + "(" + c + "):" + " Pad-" + g);
        System.out.println("Min1 " + "(" + d + "):" + " Pad-" + h);
        System.out.println("-----------------");
        
        System.out.println("(2) Funky Dorian Duo:");
        String[][] funkyD = { { "Bbm7", "Eb"}, { "12", "5"} };
        String a1 = funkyD[0][0];
        String b1 = funkyD[0][1];
        String c1 = funkyD[1][0];
        String d1 = funkyD[1][1];
        System.out.println("-----------------");
        System.out.println("Min3 " + "(" + a1 + "):" + " Pad-" + c1);
        System.out.println("Min3 " + "(" + b1 + "):" + " Pad-" + d1);
        System.out.println("-----------------");
        
        System.out.println("(2) Alt Dorian:");
        String[][] alt = { { "Em", "A"}, { "1", "5"} };
        String a2 = alt[0][0];
        String b2 = alt[0][1];
        String c2 = alt[1][0];
        String d2 = alt[1][1];
        System.out.println("-----------------");
        System.out.println("Min3 " + "(" + a2 + "):" + " Pad-" + c2);
        System.out.println("Min3 " + "(" + b2 + "):" + " Pad-" + d2);
        System.out.println("-----------------");
    }
}
