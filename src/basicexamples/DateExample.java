package basicexamples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date(2023, 1, 27);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH) + 1); // {0 - 11}
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println();

        System.out.println(date.getYear());
        System.out.println(date.getDay());

    }
}
