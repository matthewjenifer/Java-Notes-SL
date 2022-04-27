package notespackage3;

public class Stevie {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("As Progression by Stevie Wonder");
        String[][] as = {{"Bmaj7","B7","Emaj7","Amaj7","Abmi7"},{"6","10","8","6","7"}};
        String Imaj7 = as[0][0];
        String I7 = as[0][1];
        String IVmaj7 = as[0][2];
        String VIImaj7 = as[0][3];
        String bVIImi7 = as[0][4];
        String mk3a = as[1][0];
        String mk3b = as[1][1];
        String mk3c = as[1][2];
        String mk3d = as[1][3];
        String mk3e = as[1][4];
        String root1 = "D#mi";
        String root2 = "Emi";
        String root3 = "C#mi";
        String root4 = "Cmi";
        System.out.println("-----------------");
        System.out.println("Min4 [r]("+ root1 +"): " + " Pad-" + mk3a + " (" + Imaj7 + ")" );
        System.out.println("Min6 [r]("+ root2 +"): " + " Pad-" + mk3b + " (" + Imaj7 + ")" );
        System.out.println("Min4 [r]("+ root3 +"): " + " Pad-" + mk3c+ " (" + IVmaj7 + ")" );
        System.out.println("Min4 [r]("+ root1 +"): "+ " Pad-" + mk3a + " (" + Imaj7 + ")" );
        System.out.println("Min4 [r]("+ root3 +"): "+ " Pad-" + mk3d + " (" + VIImaj7 + ")" );
        System.out.println("Min4 [r]("+ root4 +"): " + " Pad-" + mk3e + " (" + bVIImi7 + ")" );
        System.out.println("-----------------");
    }
}