package hackerrank;

import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();

        // Month in Calendar starts from 0
        calendar.set(year, month - 1, day);

        String[] days = {
                "SUNDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY"
        };

        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);

        return days[dayIndex - 1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String result = findDay(month, day, year);

        System.out.println(result);
    }
}