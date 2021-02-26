package challenges.hackerrank.intro;

import java.util.Scanner;

public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //loops1(scanner);
        loops2(scanner);
        scanner.close();
    }

    private static void loops1(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
    }

    private static void loops2(Scanner scanner) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.printf("%s ", result);
            }
            System.out.println();
        }

    }
}
