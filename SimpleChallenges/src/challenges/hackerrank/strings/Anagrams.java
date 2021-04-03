package challenges.hackerrank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
        System.out.println(arraysWay(a, b));
        System.out.println(mapWay(a, b));


    }


    static boolean arraysWay(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        String aSorted = new String(aArr);
        String bSorted = new String(bArr);
        return aSorted.equals(bSorted);


    }

    static boolean mapWay(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            Character charA = a.charAt(i);
            mapA.put(charA, mapA.getOrDefault(charA, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            Character charB = b.charAt(i);
            mapB.put(charB, mapB.getOrDefault(charB, 0) + 1);
        }

        return mapA.equals(mapB);
    }
}
