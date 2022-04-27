package notespackage3;

public class Stevie {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("As Progression by Stevie Wonder");
        String[][] as = {{"Bmaj7","B7","Emaj7","Amaj7","Abmi7"},{"6","10","8","6","7"}};
        String I = as[0][0];
        String I7 = as[0][1];
        String IV = as[0][2];
        String VII = as[0][3];
        String bvii = as[0][4];
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
        System.out.println("Min4 [r]("+ root1 +"): " + " Pad-" + mk3a + " (" + I + ")" );
        System.out.println("Min6 [r]("+ root2 +"): " + " Pad-" + mk3b + " (" + I7 + ")" );
        System.out.println("Min4 [r]("+ root3 +"): " + " Pad-" + mk3c+ " (" + IV + ")" );
        System.out.println("Min4 [r]("+ root1 +"): "+ " Pad-" + mk3a + " (" + I + ")" );
        System.out.println("Min4 [r]("+ root3 +"): "+ " Pad-" + mk3d + " (" + VII + ")" );
        System.out.println("Min4 [r]("+ root4 +"): " + " Pad-" + mk3e + " (" + bvii + ")" );
        System.out.println("-----------------");
    }
}