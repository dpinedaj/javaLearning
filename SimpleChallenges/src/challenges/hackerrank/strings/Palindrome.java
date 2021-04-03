package challenges.hackerrank.strings;


public class Palindrome {

    public static void main(String[] args) {
        String a = "madam";
        if (reverse(a).equals(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static String reverse(Object s) {
        String w = s.toString();
        byte[] strByte = w.getBytes();
        byte[] result = new byte[strByte.length];

        for (int i = 0; i < strByte.length; i++) {
            result[i] = strByte[strByte.length - i - 1];
        }
        return new String(result);
    }

}
