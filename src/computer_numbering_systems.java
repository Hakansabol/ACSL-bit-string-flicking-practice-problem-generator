import java.util.Random;

public class computer_numbering_systems {
    public static void main(String[] args) {
        int rnum = 5;//(int)(Math.random() * 150000);
        int cb = 2;
        String snum = Integer.toString(rnum);

        System.out.println(snum);
        System.out.println(ctInt(snum, cb));
        System.out.println(ctBase(snum, cb));

    }

    // Turns num FROM base ten to specified base
    public static String ctInt(String str, int base) {
        return Integer.toString(Integer.parseInt(str, base));
    }

    // Turns num FROM specified base to base 10
    public static String ctBase(String num, int base) {
        return Integer.toString(Integer.valueOf(num, base));
    }
}
