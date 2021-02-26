package challenges.hackerrank.intro;

class Caster {

    static Object parseString(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException nfe2) {
                return s;
            }
        }
    }
}

