package tests;

import java.util.Arrays;

public class General {
    public static void main(String[] args) {
        int[] vals = {104970, 755956, 119500, 40580, 7900,
                22313, 145900, 112540, 36451, 78200, 339204,
                30000, 142746, 223076, 303526};
        System.out.println(Arrays.stream(vals).sum());
    }
}
