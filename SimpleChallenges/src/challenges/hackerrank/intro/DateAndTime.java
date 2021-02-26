package challenges.hackerrank.intro;

import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {

        System.out.println(dayOfWeek(2021, 02, 25));

    }

    static String dayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}
