package challenges.hackerrank.strings;

public class SubistringsComparisons {
    public static void main(String[] args) {

        int k = 3;
        String s = "welcometojava";
        loopString(s, k);

    }
static void loopString(String s, int k){
        String first = s.substring(0, k);
        String last = "";
        String current;
    for (int i = 0; i < s.length() - k + 1; i++) {
        current = s.substring(i, i + k);
        first = current.compareTo(first) < 0 ? current : first;
        last = current.compareTo(last) > 0 ? current : last;
    }
    System.out.println(first + "\n" + last);
}



}
