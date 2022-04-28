package notespackage3;

public class DAngelo { // https://www.youtube.com/watch?v=EHihOgIe3U4
    public static void main(String[] args) {
        System.out.println("-----------------");
        String key = "A#";
        String mode = "Phrygian";
        System.out.println("Another Life by DAngelo");
        System.out.println("Key:" + key + " | Mode: "+ mode);
        String[][] anotherlife = {
            {"A#mi7","Bmaj7","F#maj7","G#m11"},
            {"7","6","8","8"},
            {"F#","F","G","G"}
        };
        String i = anotherlife[0][0];
        String II = anotherlife[0][1];
        String IV = anotherlife[0][2];
        String vi = anotherlife[0][3];

        String mk3a = anotherlife[1][0];
        String mk3b = anotherlife[1][1];
        String mk3c = anotherlife[1][2];
        String mk3d = anotherlife[1][3];

        String finger1 = anotherlife[2][0];
        String finger2 = anotherlife[2][1];
        String finger3 = anotherlife[2][2];
        String finger4 = anotherlife[2][3];

        String root1 = "Dmi";
        String root2 = "D#mi";
        String root3 = "Bmi9";
        
        System.out.println("-----------------");
        System.out.println("Min4 [r]("+ root1 +"): " + " Pad-" + mk3a + " (" + i  + ")" + " _Hand: " + finger1 );
        System.out.println("Min4 [r]("+ root2 +"): " + " Pad-" + mk3b + " (" + II + ")" + " _Hand: " + finger2 );
        System.out.println("Min4 [r]("+ root2 +"): " + " Pad-" + mk3c + " (" + IV + ")" + " _Hand: " + finger3 );
        System.out.println("Min7 [r]("+ root3 +"): " + " Pad-" + mk3d + " (" + vi + ")" + " _Hand: " + finger4 );
        System.out.println("-----------------");
    }
}
