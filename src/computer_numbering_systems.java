import java.util.Random;
import java.util.Scanner;

public class computer_numbering_systems {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    // Turns num FROM string number to DECIMAL INT STRING
    public static String toDecimal(String str, int base) {
        return Integer.toString(Integer.parseInt(str, base));
    }

    // Turns num FROM DECIMAL INT STRING to STRING NUMBER
    public static String toBase(String num, int base) {
        if (base == 16) return Integer.toHexString(Integer.parseInt(num, 10));
        return Integer.toString(Integer.parseInt(num, 10), base);
    }

    public static void main(String[] args) {
        int numberOfProblems = 5; // Number of problems to generate
        for (int i = 0; i < numberOfProblems; i++) {
            generateProblem();
        }
    }

    private static void generateProblem() {
        int problemType = random.nextInt(4); // 0: Conversion, 1: Operation, 2: Mixed

        switch (problemType) {
            case 0:
                generateConversionProblem();
                break;
            case 1:
                generateOperationProblem();
                break;
            case 2:
                generateMixedProblem();
                break;
            case 3:
                generateBaseToDecimalProblem();
                break;
        }
    }

    private static void generateConversionProblem() {
        // Generate a random number in decimal
        int decimalNumber = random.nextInt(1000); // Range from 0 to 1000
        int targetBase = getRandomBase();

        System.out.printf("Convert the decimal number %d to %s:\n", decimalNumber, getBaseString(targetBase));
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        String correctAnswer = convertToBase(decimalNumber, targetBase);

        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!\n");
        } else {
            System.out.printf("Incorrect. The correct answer is %s.\n\n", correctAnswer);
        }
    }

    private static void generateOperationProblem() {
        // Generate two random numbers in different bases
        int base1 = getRandomBase(true);
        int base2 = getRandomBase(true);

        int number1 = random.nextInt(1000); // Generate random number for the first base
        int number2 = random.nextInt(1000); // Generate random number for the second base

        String base1Str = convertToBase(number1, base1);
        String base2Str = convertToBase(number2, base2);

        System.out.printf("What is %s (%s) + %s (%s)?\n", base1Str, getBaseString(base1), base2Str, getBaseString(base2));
        System.out.print("Your answer (in decimal): ");
        String answer = scanner.nextLine();

        int correctAnswer = number1 + number2;

        if (Integer.parseInt(answer) == correctAnswer) {
            System.out.println("Correct!\n");
        } else {
            System.out.printf("Incorrect. The correct answer is %d.\n\n", correctAnswer);
        }
    }

    private static void generateMixedProblem() {
        int decimalNumber = random.nextInt(100);
        int targetBase = getRandomBase();
        System.out.printf("Convert the decimal number %d to %s:\n", decimalNumber, getBaseString(targetBase));
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        String correctAnswer = convertDecimal(decimalNumber, targetBase);

        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!\n");
        } else {
            System.out.printf("Incorrect. The correct answer is %s.\n\n", correctAnswer);
        }
    }

    private static void generateBaseToDecimalProblem() {
        // Generate a random number in a base (binary, octal, hexadecimal)
        int base = random.nextInt(3); // 0: Binary, 1: Octal, 2: Hexadecimal
        int randomNumber = random.nextInt(1000);

        System.out.printf("Convert the %s number %s to decimal:\n", getBaseString(base), convertDecimal( randomNumber, baseSwitch(base)));
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        String correctAnswer = Integer.toString( randomNumber);

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!\n");
        } else {
            System.out.printf("Incorrect. The correct answer is %s.\n\n", correctAnswer);
        }
    }

    private static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    private static String convertToBase(int number, int base) {
        switch (base) {
            case 0:
                return Integer.toBinaryString(number);
            case 1:
                return Integer.toOctalString(number);
            case 2:
                return Integer.toHexString(number);
            case 3:
                return Integer.toString(number).toUpperCase();
            default:
                return String.valueOf(number);
        }
    }

    private static String getBaseString(int baseIndex) {
        switch (baseIndex) {
            case 0:
                return "Binary";
            case 1:
                return "Octal";
            case 2:
                return "Hexadecimal";
            case 3:
                return "Decimal";
            default:
                return "help me i errored";
        }
    }

    private static int baseSwitch(int baseIndex) {
        switch (baseIndex) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 16;
            case 3:
                return 10;
            default:
                System.out.println("narrr baseSwitch");
                return 0;
        }
    }

    private static int getRandomBase(boolean fcont) {
        return random.nextInt(4);
    }
    private static int getRandomBase() {
        return random.nextInt(3);
    }
}
