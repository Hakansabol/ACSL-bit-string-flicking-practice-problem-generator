import java.util.Random;

public class computer_numbering_systems {
    public static void main(String[] args) {
        int rnum = 17;//(int)(Math.random() * 150000);
        int cb = 8;
        String snum = Integer.toString(rnum);

        System.out.println(snum);
        System.out.println(ctInt(snum, cb));
        System.out.println(ctBase(snum, cb));

    }

    // Turns num FROM string number to DECIMAL INT
    public static String ctInt(String str, int base) {
        return Integer.toString(Integer.parseInt(str, base));
    }

    // Turns num FROM DECIMAL INT STRING to STRING NUMBER
    public static String ctBase(String num, int base) {
        if (base == 16) return Integer.toHexString(Integer.parseInt(num, 10));
        return Integer.toString(Integer.parseInt(num, 10), base);
    }
}
