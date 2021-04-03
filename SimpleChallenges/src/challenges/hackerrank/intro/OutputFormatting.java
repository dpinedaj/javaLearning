package challenges.hackerrank.intro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //spacing(sc);
        //simpleCurrencyFormatter(sc);
        currencyFormatterLocale(sc);
        sc.close();

    }

    private static void spacing(Scanner sc) {
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
    private static void simpleCurrencyFormatter(Scanner scanner) {
        double payment = scanner.nextDouble();
        NumberFormat format3 = NumberFormat.getInstance();
        format3.setGroupingUsed(true);

        String[] currencies = {
                String.format("US: $%s", format3.format(payment)),
                String.format("India: Rs.%s", format3.format(payment)),
                String.format("China: ￥%s", format3.format(payment)),
                String.format("France: %s €", format3.format(payment))
        };
        for (String curr: currencies) {
            System.out.println(curr);
        }
    }
    private static void currencyFormatterLocale(Scanner scanner){
        double payment = scanner.nextDouble();

        // Set custom needed locales
        Locale indiaLocale = new Locale("en", "IN");

        // Locales collections
        Map<String, Locale> locales = new HashMap<String, Locale>();

        {       locales.put("US: ", Locale.US);
                locales.put("India: ", indiaLocale);
                locales.put("China: ", Locale.CHINA);
                locales.put("France: ", Locale.FRANCE);
        }

        for (String curr: locales.keySet()) {
            System.out.println(curr +
                    NumberFormat.getCurrencyInstance(locales.get(curr)).format(payment));
        }

    }
}
