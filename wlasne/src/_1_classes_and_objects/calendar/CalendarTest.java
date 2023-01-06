package _1_classes_and_objects.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); // Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%n", "Monday", "    Tuesday", "    Wednesday",
                "    Thursday", "Friday", "    Saturday", "Sunday");
        for (int i = 1; i < value; i++)
            System.out.print(" ");//odstepy miedzy dniami miesiaca(liczbami)

        while (date.getMonthValue() == month) {
            if (date.getDayOfMonth() == 1 ) {
                System.out.printf("%17d", date.getDayOfMonth());

            } else if (date.getDayOfWeek().getValue() == 1) {
                System.out.printf("%7d", date.getDayOfMonth());//ustala szerokoœæ znaków dni miesi¹ca

            } else if (date.getDayOfWeek().getValue() == 2) {
                System.out.printf("%10d", date.getDayOfMonth());//ustala szerokoœæ znaków dni miesi¹ca
            } else if (date.getDayOfWeek().getValue() == 3) {
                System.out.printf("%11d", date.getDayOfMonth());
            } else if (date.getDayOfWeek().getValue() == 4) {
                System.out.printf("%12d", date.getDayOfMonth());
            } else if (date.getDayOfWeek().getValue() == 5) {
                System.out.printf("%10d", date.getDayOfMonth());
            } else if (date.getDayOfWeek().getValue() == 6) {
                System.out.printf("%10d", date.getDayOfMonth());
            } else if (date.getDayOfWeek().getValue() == 7) {
                System.out.printf("%10d", date.getDayOfMonth());
            }

            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
            //System.out.println("date.getDayOfWeek().getValue()" + date.getDayOfWeek().getValue());
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
        //System.out.println("date.getDayOfWeek().getValue() != 1: " + date.getDayOfWeek().getValue());
    }
}

