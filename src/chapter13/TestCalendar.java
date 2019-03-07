package chapter13;

import java.lang.System;
import java.lang.String;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR:\t"          + calendar.get(Calendar.YEAR)         );
        System.out.println("MONTH:\t"         + calendar.get(Calendar.MONTH)        );
        System.out.println("DATE:\t"          + calendar.get(Calendar.DATE)         );
        System.out.println("HOUR:\t"          + calendar.get(Calendar.HOUR)         );
        System.out.println("HOUR_OF_DAY:\t"   + calendar.get(Calendar.HOUR_OF_DAY)  );
        System.out.println("MINUTE:\t"        + calendar.get(Calendar.MINUTE)       );
        System.out.println("SECOND:\t"        + calendar.get(Calendar.SECOND)       );
        System.out.println("DAY_OF_WEEK:\t"   + calendar.get(Calendar.DAY_OF_WEEK)  );
        System.out.println("DAY_OF_MONTH:\t"  + calendar.get(Calendar.DAY_OF_MONTH) );
        System.out.println("DAY_OF_YEAR: "    + calendar.get(Calendar.DAY_OF_YEAR)  );
        System.out.println("WEEK_OF_MONTH: "  + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: "   + calendar.get(Calendar.WEEK_OF_YEAR) );
        System.out.println("AM_PM: "          + calendar.get(Calendar.AM_PM)        );

        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Satruday"};

        calendar.set(1997, 11, 25);  // 11 = Calendar.DECEMBER
        System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar.get(Calendar.DAY_OF_WEEK) -1]);

    }  // main()

}  // class TestCalendar