package challenges.hackerrank.intro;

import java.util.Scanner;

public class IfElseStatement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(ifWay(N));
        System.out.println(oneLine(N));
        scanner.close();
    }

    private static String ifWay(int N) {
        if (N % 2 == 1 || (N >= 6 && N <= 20)) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }

    private static String oneLine(int N) {
        return (N % 2 == 1 || (N >= 6 && N <= 20)) ? "Weird" : "Not Weird";
    }
}
