package challenges.hackerrank.intro;

import java.util.Scanner;

public class StdInStdOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //scanNum(scan);
        scanManyTypes(scan);
        scan.close();


    }

    private static void scanNum(Scanner scan) {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    private static void scanManyTypes(Scanner scan) {
        for (int i = 0; i < 3; i++) {
            String value = scan.nextLine();
            Object casted = Caster.parseString(value);
            String type = casted.getClass().getSimpleName();
            System.out.println(String.format("%s: %s", type, value));

        }
    }
}


