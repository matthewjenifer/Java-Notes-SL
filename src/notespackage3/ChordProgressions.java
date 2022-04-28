package notespackage3;
// source: https://www.youtube.com/watch?v=Vyc8lezaa9g
// https://cdn.discordapp.com/attachments/942287615493828699/969023537098674236/Maj1-C.png

public class ChordProgressions {

    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("(1) Axis Progression:");
        String[][] axis = { { "I", "V", "vi", "IV" }, { "1", "4", "5", "3" } };
        String a = axis[0][0];
        String b = axis[0][1];
        String c = axis[0][2];
        String d = axis[0][3];
        String e = axis[1][0];
        String f = axis[1][1];
        String g = axis[1][2];
        String h = axis[1][3];
        System.out.println("-----------------");
        System.out.println("Maj1 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Maj1 " + "(" + b + "):" + " Pad-" + f);
        System.out.println("Maj1 " + "(" + c + "):" + " Pad-" + g);
        System.out.println("Maj1 " + "(" + d + "):" + " Pad-" + h);
        System.out.println("-----------------");

        System.out.println("(2) Axis ALT Progression:");
        System.out.println("-----------------");
        System.out.println("Maj1 " + "(" + c + "):" + " Pad-" + g);
        System.out.println("Maj1 " + "(" + d + "):" + " Pad-" + h);
        System.out.println("Maj1 " + "(" + a + "):" + " Pad-" + e);
        System.out.println("Maj1 " + "(" + b + "):" + " Pad-" + f);
        System.out.println("-----------------");

        System.out.println("(3) Andalusian Cadence:");
        String[][] andalusian = { { "i", "bVII", "bVI", "V" }, { "1", "3", "5", "8" } };
        String aa = andalusian[0][0];
        String bb = andalusian[0][1];
        String cc = andalusian[0][2];
        String dd = andalusian[0][3];
        String ee = andalusian[1][0];
        String ff = andalusian[1][1];
        String gg = andalusian[1][2];
        String hh = andalusian[1][3];
        System.out.println("-----------------");
        System.out.println("Min6 " + "(" + aa + "):" + " Pad-" + ee);
        System.out.println("Min6 " + "(" + bb + "):" + " Pad-" + ff);
        System.out.println("Min6 " + "(" + cc + "):" + " Pad-" + gg);
        System.out.println("Min6 " + "(" + dd + "):" + " Pad-" + hh);
        System.out.println("-----------------");

        System.out.println("(4) Aeloian Vamp:");
        String[][] aeloian = { { "i", "bVII", "bVI", "bVII" }, { "1", "3", "5", "3" } };
        String aaa = aeloian[0][0];
        String bbb = aeloian[0][1];
        String ccc = aeloian[0][2];
        String ddd = aeloian[0][3];
        String eee = aeloian[1][0];
        String fff = aeloian[1][1];
        String ggg = aeloian[1][2];
        String hhh = aeloian[1][3];
        System.out.println("-----------------");
        System.out.println("Min6 " + "(" + aaa + "):" + " Pad-" + eee);
        System.out.println("Min6 " + "(" + bbb + "):" + " Pad-" + fff);
        System.out.println("Min6 " + "(" + ccc + "):" + " Pad-" + ggg);
        System.out.println("Min6 " + "(" + ddd + "):" + " Pad-" + hhh);
        System.out.println("-----------------");

        System.out.println("(5) DooWop Riff:");
        String[][] doowop = { { "I", "vi", "IV", "V" }, { "1", "5", "3", "4" } };
        String aaaa = doowop[0][0];
        String bbbb = doowop[0][1];
        String cccc = doowop[0][2];
        String dddd = doowop[0][3];
        String eeee = doowop[1][0];
        String ffff = doowop[1][1];
        String gggg = doowop[1][2];
        String hhhh = doowop[1][3];
        System.out.println("-----------------");
        System.out.println("Maj1 " + "(" + aaaa + "):" + " Pad-" + eeee);
        System.out.println("Maj1 " + "(" + bbbb + "):" + " Pad-" + ffff);
        System.out.println("Maj1 " + "(" + cccc + "):" + " Pad-" + gggg);
        System.out.println("Maj1 " + "(" + dddd + "):" + " Pad-" + hhhh);
        System.out.println("-----------------");

        System.out.println("(6) Major Scale:");
        String[][] major = { { "I", "V", "IV", "V" }, { "1", "4", "3", "4" } };
        String aaaaa = major[0][0];
        String bbbbb = major[0][1];
        String ccccc = major[0][2];
        String ddddd = major[0][3];
        String eeeee = major[1][0];
        String fffff = major[1][1];
        String ggggg = major[1][2];
        String hhhhh = major[1][3];
        System.out.println("-----------------");
        System.out.println("Maj1 " + "(" + aaaaa + "):" + " Pad-" + eeeee);
        System.out.println("Maj1 " + "(" + bbbbb + "):" + " Pad-" + fffff);
        System.out.println("Maj1 " + "(" + ccccc + "):" + " Pad-" + ggggg);
        System.out.println("Maj1 " + "(" + ddddd + "):" + " Pad-" + hhhhh);
        System.out.println("-----------------");

        System.out.println("(7) Mixolydian Progression:");
        String[][] mixolydian = { { "I", "bVII", "IV", "I" }, { "1", "7", "8", "1" } };
        String aaaaaa = mixolydian[0][0];
        String bbbbbb = mixolydian[0][1];
        String cccccc = mixolydian[0][2];
        String dddddd = mixolydian[0][3];
        String eeeeee = mixolydian[1][0];
        String ffffff = mixolydian[1][1];
        String gggggg = mixolydian[1][2];
        String hhhhhh = mixolydian[1][3];
        System.out.println("-----------------");
        System.out.println("Maj5 " + "(" + aaaaaa + "):" + " Pad-" + eeeeee);
        System.out.println("Maj5 " + "(" + bbbbbb + "):" + " Pad-" + ffffff);
        System.out.println("Maj5 " + "(" + cccccc + "):" + " Pad-" + gggggg);
        System.out.println("Maj5 " + "(" + dddddd + "):" + " Pad-" + hhhhhh);
        System.out.println("-----------------");
    }
}
