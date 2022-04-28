package notespackage3;

public class Paul {
    public static void main(String[] args) {
        System.out.println("-----------------");
        String key = "D";
        String mode = "Ionian";
        System.out.println("Maybe Im Amazed by Paul McCartney");
        System.out.println("Key: " + key + " | Mode: "+ mode);
        String[][] paul = {
        {"A","D6/F#","Dmi/F","Emi7"},
        {"","","",""},
        {"F#","F","G","G"}
        };
        String V = paul[0][0];
        String I = paul[0][1];
        String i6 = paul[0][2];
        String ii7 = paul[0][3];
        String mk3a = paul[1][0];
        String mk3b = paul[1][1];
        String mk3c = paul[1][2];
        String mk3d = paul[1][3];
        String finger1 = paul[2][0];
        String finger2 = paul[2][1];
        String finger3 = paul[2][2];
        String finger4 = paul[2][3];
        String root1 = "";
        String root2 = "";
        String root3 = "";
        System.out.println("-----------------");
        System.out.println("Intro");
        System.out.println("-----------------");
        System.out.println("M__4 [r]("+ root1 +"): " + " Pad-" + mk3a + " (" + i6  + ")" + " _Hand: " + finger1 );
        System.out.println("M__4 [r]("+ root2 +"): " + " Pad-" + mk3b + " (" + I + ")" + " _Hand: " + finger2 );
        System.out.println("M__4 [r]("+ root2 +"): " + " Pad-" + mk3c + " (" + V + ")" + " _Hand: " + finger3 );
        System.out.println("M__7 [r]("+ root3 +"): " + " Pad-" + mk3d + " (" + ii7 + ")" + " _Hand: " + finger4 );
        System.out.println("-----------------");
    }
}
