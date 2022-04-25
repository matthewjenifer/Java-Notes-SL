package notespackage3;

public class PhrygianProgrssions {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("(1) London Calling:");
        String[][] theClash = { { "Em", "Fmaj9", "G", "D" }, { "7", "5", "2", "3" } };
        String a = theClash[0][0];
        String b = theClash[0][1];
        String c = theClash[0][2];
        String d = theClash[0][3];
        String e = theClash[1][0];
        String f = theClash[1][1];
        String g = theClash[1][2];
        String h = theClash[1][3];
        System.out.println("-----------------");
        System.out.println("Bm_Min2 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Am_Min2 " + "(" + b + "):" + " Pad-" + f);
        System.out.println("B_Min2 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Am_Min2 " + "(" + b + "):" + " Pad-" + f);
        System.out.println("Bm_Min2 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Bm_Min3 " + "(" + c + "):" + " Pad-" + g);
        System.out.println("Bm_Min2 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Bm_Min3 " + "(" + d + "):" + " Pad-" + h);
        System.out.println("-----------------");
    }
}