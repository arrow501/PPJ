package PPJ18;

import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        printCalendar(2022, 12);
    }
    public static void printCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // Java month: January = 0

        // Get the first day of the week for the given month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Shift the first day of the week to Monday (1), default being Sunday
        int dayOfWeekOf1stDayOfMonth = (firstDayOfWeek + 5) % 7 + 1;

        // Get the number of days in the given month
        int numDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the column headers for the days of the week
        System.out.println("Mo Tu We Th Fr Sa Su");

        // Print indentation for last months days of the first week
        for (int i = 1; i < dayOfWeekOf1stDayOfMonth; i++) {
            System.out.print("   ");
        }
        // Print the days of the week in the calendar
        for (int i = 1, day = dayOfWeekOf1stDayOfMonth; i <= numDaysInMonth; i++, day++) {
            if (day > 7) {
                day = 1;
                System.out.println();
            }
            System.out.print(String.format("%2d ", i));
        }
        System.out.println();
    }
}
