package project3;

import java.lang.System;
import java.lang.String;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import project3.Weather;
import project3.Event;
import project3.SportEvent;
import project3.MusicEvent;
import project3.ArtEvent;
import project3.BasketBallGame;
import project3.SoccerGame;
import project3.Concert;
import project3.Orchestra;

public class TestEvent {

    public static void main(String[] args) throws ParseException {

        Date dateTime;

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("07/28/2018 10:00");
        new SoccerGame("Ultimate Cup", "River City Sportsplex", dateTime, 1000, new String[]{"UR", "VCU"}, new int[]{1, 0}, "Professional", new Weather(true, 95.0, 2.0, 0.8));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("07/29/2018 13:30");
        new BasketBallGame("NCAA", "Siegel Center", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{30, 40}, "College");

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/01/2018 13:00");
        new Concert("Folk Festival", "Browns Island", dateTime, 900, new String[]{"The Green Fields of America", "Beâ€™la Dona", "Dale Ann Bradley"} , "Folk Music", new Weather(false, 85.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/01/2018 20:00");
        new Orchestra("Dominion Energy Casual Fridays", "Dominion Arts Center", dateTime, 800, new String[]{"Richmond Symphony"}, true);

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/02/2018 10:00");
        new SoccerGame("Jefferson Cup", "River City Sportsplex", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{1, 1}, "College", new Weather(true, 85.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/02/2018 20:30");
        new Concert("Innsbrook After Hours", "Innsbrook", dateTime, 500, new String[]{"Lee Brice"} , "Jazz", new Weather(true, 65.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/03/2018 10:30");
        new ArtEvent("Abstract Art in Dialogue", "Virginia Museum of Fine Arts", dateTime, 500, "Abstract Art");

        System.out.println("Events:\n" + Event.getEventList().toString());
        System.out.println();

        Iterator<Event> eventListIterator = Event.getEventList().iterator();
        Event event;
        int   eventNumber;
        while (eventListIterator.hasNext()) {
            event       = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            System.out.println("Event " + String.valueOf(eventNumber) + ": Class: " + event.getClass().getSimpleName() + ",\tEvent Name: " + event.getName());
        }  // while
        System.out.println();

        TestEvent.getNumberOfObjects();
        System.out.println();

    }  // main()

    public static void getNumberOfObjects() {
        System.out.println("Events: "           + Event         .getNumberOfObjects());
        System.out.println("Sport Events: "     + SportEvent    .getNumberOfObjects());
        System.out.println("Music Events: "     + MusicEvent    .getNumberOfObjects());
        System.out.println("Art Events: "       + ArtEvent      .getNumberOfObjects());
        System.out.println("Soccer Games: "     + SoccerGame    .getNumberOfObjects());
        System.out.println("Basketball Games: " + BasketBallGame.getNumberOfObjects());
        System.out.println("Concerts: "         + Concert       .getNumberOfObjects());
        System.out.println("Orchestras: "       + Orchestra     .getNumberOfObjects());
    }  // getNumberOfObjects()

}  // class TestEvent