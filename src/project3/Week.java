package project3;

import java.util.Date;
import java.util.Calendar;

public class Week {

    public static boolean isWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7);
    }  // isWeekEnd()

    public static boolean isWeekDay(Date date) {return !(Week.isWeekEnd(date));}

}  // class Week