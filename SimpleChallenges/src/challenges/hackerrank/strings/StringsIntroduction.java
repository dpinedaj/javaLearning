package challenges.hackerrank.strings;

import java.util.Scanner;


public class StringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String comp = A.compareTo(B) > 0 ? "Yes" : "No";
        int l = A.length() + B.length();
        System.out.println(l);
        System.out.println(comp);

        String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(newA + " " + newB);

    }
}
