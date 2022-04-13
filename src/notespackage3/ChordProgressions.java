package notespackage3;
// source: https://www.youtube.com/watch?v=Vyc8lezaa9g

public class ChordProgressions {

    public static void main(String[] args) {
        int[] axis;
        axis = new int[4];
        axis[0] = 1; // I
        axis[1] = 4; // V
        axis[2] = 5; // vi
        axis[3] = 3; // IV

        System.out.println("Axis Progression:");

        for (int i = 0; i < axis.length; i++)
            System.out.println("Maj1 : " + "Pad-" + axis[i]);

        int[] axisAlt;
        axisAlt = new int[4];
        axisAlt[0] = 5; // vi
        axisAlt[1] = 3; // IV
        axisAlt[2] = 1; // I
        axisAlt[3] = 4; // V

        System.out.println("Axis ALT Progression:");

        for (int i = 0; i < axisAlt.length; i++)
            System.out.println("Maj1 : " + "Pad-" + axisAlt[i]);

        int[] andalusian;
        andalusian = new int[4];
        andalusian[0] = 1; // i
        andalusian[1] = 3; // bVII
        andalusian[2] = 5; // bVI
        andalusian[3] = 8; // V

        System.out.println("Andalusian Cadence:");

        for (int i = 0; i < andalusian.length; i++)
            System.out.println("Min6 : " + "Pad-" + andalusian[i]);

        int[] aeloian;
        aeloian = new int[4];
        aeloian[0] = 1; // i
        aeloian[1] = 3; // bVII
        aeloian[2] = 5; // bVI
        aeloian[3] = 3; // bVII

        System.out.println("Aeolian Vamp:");

        for (int i = 0; i < aeloian.length; i++)
            System.out.println("Min6 : " + "Pad-" + aeloian[i]);

        int[] doowop;
        doowop = new int[4];
        doowop[0] = 1; // I
        doowop[1] = 5; // vi
        doowop[2] = 3; // IV
        doowop[3] = 4; // V

        System.out.println("DooWop Vamp:");

        for (int i = 0; i < doowop.length; i++)
            System.out.println("Maj1 : " + "Pad-" + doowop[i]);

        int[] major;
        major = new int[4];
        major[0] = 1; // I
        major[1] = 4; // V
        major[2] = 3; // IV
        major[3] = 4; // V

        System.out.println("Major Scale Vamp:");

        for (int i = 0; i < major.length; i++)
            System.out.println("Maj1 : " + "Pad-" + major[i]);

        int[] mixolydian;
        mixolydian = new int[4];
        mixolydian[0] = 1; // I
        mixolydian[1] = 7; // bVII
        mixolydian[2] = 8; // IV
        mixolydian[3] = 1; // I

        System.out.println("Mixolydian Vamp:");

        for (int i = 0; i < mixolydian.length; i++)
            System.out.println("Maj5 : " + "Pad-" + mixolydian[i]);
    }
}
