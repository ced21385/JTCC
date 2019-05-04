package project5;

import java.lang.System;
import java.lang.String;
import java.util.*;
import java.text.ParseException;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.Collections.*;

public class TestEvent {

    public static void main(String[] args) throws ParseException {

        SoccerGame soccerGame = new SoccerGame("Ultimate Cup", 1000);

        BasketBallGame basketBallGame = new BasketBallGame("NCAA", 2000);

        Concert concert = new Concert("Folk Festival", 900);

        Orchestra orchestra = new Orchestra("Dominion Energy Casual Fridays", 800);

        SoccerGame soccerGame1 = new SoccerGame("Jefferson Cup", 2000);

        Concert concert1 = new Concert("Innsbrook After Hours", 500);

        ArtEvent art = new ArtEvent("Abstract Art in Dialogue", 500);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(soccerGame.getAudience());list.add(basketBallGame.getAudience());list.add(concert.getAudience());
        list.add(orchestra.getAudience());list.add(soccerGame1.getAudience());list.add(concert1.getAudience());list.add(art.getAudience());

        Double average = IntStream.of(soccerGame.getAudience(), basketBallGame.getAudience(), concert.getAudience(),
                orchestra.getAudience(), soccerGame1.getAudience(), concert1.getAudience(), art.getAudience()).limit(Event.getNumberOfObjects())
                .average().getAsDouble();

        int[] list3 = Stream.of(soccerGame.getAudience(), basketBallGame.getAudience(), concert.getAudience(),
                orchestra.getAudience(), soccerGame1.getAudience(), concert1.getAudience(), art.getAudience()).map(IntStream::of).
                reduce(IntStream::concat).get().toArray();

        IntSummaryStatistics stats = IntStream.of(list3).summaryStatistics();

        System.out.println("Events:");
        Iterator<Event> eventListIterator = Event.getEventList().iterator();
        Event event;
        int eventNumber;
        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            System.out.println("Event " + (eventNumber) + ": Class: " + event.getClass().getSimpleName() +
                    ";\t    Name: " + event.getName() + ";\t\t Audience: " + event.getAudience());
        }  // while

        System.out.println("\nStatistics of audiences (all events): ");
        System.out.println("All Events: \t" + "Count: " + stats.getCount() + "; \t\t Sum: " +
                stats.getSum() + ";\t Average: " + average.intValue() + ";  Max: " + stats.getMax() + ";\t\t Min: " +
                stats.getMin() + "\n");

        int maxEvents = 0;
        for(int i = 0; i < 7; i++)
            if (list.get(i) == stats.getMax()) {
                maxEvents++;
            }
        System.out.println("Number of most popular events: " + maxEvents);
        System.out.println("Most popular events (sorted by name): ");
        if(soccerGame.getAudience()==stats.getMax()){
            System.out.println("Event 1: " + soccerGame.getName());
        }if(soccerGame1.getAudience() == stats.getMax()) {
            System.out.println("Event 5: " + soccerGame1.getName());
        }if(basketBallGame.getAudience() == stats.getMax()){
            System.out.println("Event 2: " + basketBallGame.getName());
        }if(concert.getAudience() == stats.getMax()){
            System.out.println("Event 3: " + concert.getName());
        }if(orchestra.getAudience() == stats.getMax()){
            System.out.println("Event 4: " + orchestra.getName());
        }if(concert1.getAudience() == stats.getMax()){
            System.out.println("Event 6: " + concert1.getName());
        }if(art.getAudience() == stats.getMax()){System.out.println("Event 7: " + art.getName());}

        ArrayList<Event> events = new ArrayList<>(Event.getEventList());
        sort(events, Comparator.comparing(Event::getName));
        sort(events, Comparator.comparing(o -> o.getClass().getName()));

        System.out.println("\nEvents (sorted by class name then by name):");
        eventListIterator = events.iterator();
        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            String eventClassName = event.getClass().getSimpleName() + ";";
            String eventName = event.getName() + ";";
            int audienceSize = event.getAudience();

            System.out.printf("Event %s: Class: %-15s Event Name: %-33s Audience: %s\n", eventNumber, eventClassName, eventName, audienceSize );
        }  // while

        ArrayList<Event> eventsSec = new ArrayList<>(Event.getEventList());
        sort(eventsSec, Comparator.comparing(o -> o.getClass().getName()));

        LinkedHashMap<String, ArrayList<Event> > eventMap = new LinkedHashMap<>();
        Iterator<Event> copy2Iterator = eventsSec.iterator();

        while(copy2Iterator.hasNext()){
            Event eventTemp = copy2Iterator.next();
            String key = eventTemp.getClass().getSimpleName();
            eventMap.computeIfAbsent(key, k -> new ArrayList<>()).add(eventTemp);
        }

        System.out.println("\nStatistics of audience (by event class name): ");
        System.out.println("ArtEvent: \t"+"\tCount: " + ArtEvent.getNumberOfObjects() + ";\tSum: " + art.getAudience() +
                ";\tAverage: " + art.getAudience() + ";\tMax: " + art.getAudience() + ";\tMin: " +art.getAudience());
        System.out.println("BasketBallGame: Count: " + BasketBallGame.getNumberOfObjects() + ";\tSum: " +
                basketBallGame.getAudience() + ";\tAverage: " + basketBallGame.getAudience() + ";\tMax: "+
                basketBallGame.getAudience() + ";\tMin: " + basketBallGame.getAudience());
        System.out.println("Concert: \t\tCount: " + Concert.getNumberOfObjects() + ";\tSum: " +
                (concert.getAudience() + concert1.getAudience()) + ";\tAverage: " + (concert.getAudience() + concert1.getAudience())/2
                + ";\tMax: "+ concert.getAudience() + ";\tMin: " + concert1.getAudience());
        System.out.println("Orchestra: \t\tCount: " + Orchestra.getNumberOfObjects() + ";\tSum: " +
                orchestra.getAudience() + ";\tAverage: " + orchestra.getAudience() + ";\tMax: "+
                orchestra.getAudience() + ";\tMin: " + orchestra.getAudience());
        System.out.println("SoccerGame: \tCount: " + SoccerGame.getNumberOfObjects() + ";\tSum: " +
                (soccerGame.getAudience() + soccerGame1.getAudience()) + ";\tAverage: " + (soccerGame.getAudience() + soccerGame1.getAudience())/2
                + ";\tMax: "+ soccerGame1.getAudience() + ";\tMin: " + soccerGame.getAudience());
    }
}