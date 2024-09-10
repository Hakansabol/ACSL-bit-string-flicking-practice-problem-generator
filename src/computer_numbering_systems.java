import java.util.Random;

public class computer_numbering_systems {
    public static void main(String[] args) {
        int rnum = 3564;
        String snum = Integer.toString(rnum);

        System.out.println(snum);
        System.out.println(ctInt(snum, 16));

    }

    public static String ctInt(String str, int base) {
        return Integer.toString(Integer.parseInt(str, base));
    }

    public static String ctBase(String num, int base) {
        return Integer.toString(Integer.valueOf(num, base));
    }
}
