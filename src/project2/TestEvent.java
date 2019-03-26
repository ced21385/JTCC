package project2;

import java.lang.System;
import java.lang.String;
import java.lang.Object;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import project2.Weather;
import project2.Event;
import project2.SportEvent;
import project2.MusicEvent;
import project2.ArtEvent;
import project2.BasketballGame;
import project2.SoccerGame;
import project2.Concert;
import project2.Orchestra;

public class TestEvent {

    public static void main(String[] args) throws ParseException {

        Date dateTime;
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(2018, 6, 28, 10, 0);  // 07/28/2018, 10:00
        dateTime = calendar.getTime();
        Object object1 = new SoccerGame("Ultimate Cup", "River City Sportsplex", dateTime, 1000, new String[]{"UR", "VCU"}, new int[]{1, 0}, "Professional", new Weather(true, 95.0, 2.0, 0.8));
        System.out.println(object1);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 6, 29, 13, 30);  // 07/29/2018, 13:30
        dateTime = calendar.getTime();
        Object object2 = new BasketballGame("NCAA", "Siegel Center", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{30, 40}, "College");
        System.out.println(object2);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 7, 1, 13, 0);  // 08/01/2018, 13:00
        dateTime = calendar.getTime();
        Object object3 = new Concert("Folk Festival", "Browns Island", dateTime, 900, new String[]{"The Green Fields of America", "Beâ€™la Dona", "Dale Ann Bradley"} , "Folk Music", new Weather(false, 85.0, 2.0, 0.5));
        System.out.println(object3);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 7, 1, 20, 0);  // 08/01/2018, 20:00
        dateTime = calendar.getTime();
        Object object4 = new Orchestra("Dominion Energy Casual Fridays", "Dominion Arts Center", dateTime, 800, new String[]{"Richmond Symphony"}, true);
        System.out.println(object4);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 7, 2, 10, 0);  // 08/02/2018, 10:00
        dateTime = calendar.getTime();
        Object object5 = new SoccerGame("Jefferson Cup", "River City Sportsplex", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{1, 1}, "College", new Weather(true, 85.0, 2.0, 0.5));
        System.out.println(object5);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 7, 2, 20, 30);  // 08/02/2018, 20:30
        dateTime = calendar.getTime();
        Object object6 = new Concert("Innsbrook After Hours", "Innsbrook", dateTime, 500, new String[]{"Lee Brice"} , "Jazz", new Weather(true, 65.0, 2.0, 0.5));
        System.out.println(object6);
        TestEvent.getNumberOfObjects();
        System.out.println();

        calendar.set(2018, 7, 3, 10, 30);  // 08/03/2018, 10:30
        dateTime = calendar.getTime();
        Object object7 = new ArtEvent("Abstract Art in Dialogue", "Virginia Museum of Fine Arts", dateTime, 500, "Abstract Art");
        System.out.println(object7);
        TestEvent.getNumberOfObjects();
        System.out.println();

    }  // main()

    public static void getNumberOfObjects() {
        System.out.println("Events: "           + Event         .getNumberOfObjects());
        System.out.println("Sport Events: "     + SportEvent    .getNumberOfObjects());
        System.out.println("Music Events: "     + MusicEvent    .getNumberOfObjects());
        System.out.println("Art Events: "       + ArtEvent      .getNumberOfObjects());
        System.out.println("Soccer Games: "     + SoccerGame    .getNumberOfObjects());
        System.out.println("Basketball Games: " + BasketballGame.getNumberOfObjects());
        System.out.println("Concerts: "         + Concert       .getNumberOfObjects());
        System.out.println("Orchestras: "       + Orchestra     .getNumberOfObjects());
    }  // getNumberOfObjects()

}  // class TestEvent