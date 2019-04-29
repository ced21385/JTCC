package project5;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.text.ParseException;
import java.util.stream.IntStream;

public class TestEvent {

    public static void main(String[] args) throws ParseException {

        SoccerGame soccerGame = new SoccerGame("Ultimate Cup", 1000);

        BasketBallGame basketBallGame = new BasketBallGame("NCAA", 2000);

        Concert concert = new Concert("Folk Festival", 900);

        Orchestra orchestra = new Orchestra("Dominion Energy Casual Fridays", 800);

        SoccerGame soccerGame1 = new SoccerGame("Jefferson Cup", 2000);

        Concert concert1 = new Concert("Innsbrook After Hours", 500);

        ArtEvent art = new ArtEvent("Abstract Art in Dialogue", 500);


        int audienceSum = soccerGame.getAudience() + basketBallGame.getAudience() + concert.getAudience() + orchestra.getAudience()
                + soccerGame1.getAudience() + concert1.getAudience() + art.getAudience();

        Double average = IntStream.of(soccerGame.getAudience(), basketBallGame.getAudience(), concert.getAudience(),
                orchestra.getAudience(), soccerGame1.getAudience(), concert1.getAudience(), art.getAudience()).limit(Event.getNumberOfObjects())
                .average().getAsDouble();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(soccerGame.getAudience()));
        list.add(new Integer(basketBallGame.getAudience()));
        list.add(new Integer(concert.getAudience()));
        list.add(new Integer(orchestra.getAudience()));
        list.add(new Integer(soccerGame1.getAudience()));
        list.add(new Integer(concert1.getAudience()));
        list.add(new Integer(art.getAudience()));

        System.out.println("Events:");

        Iterator<Event> eventListIterator = Event.getEventList().iterator();
        Event event;
        int eventNumber;
        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            System.out.println("Event " + String.valueOf(eventNumber) + ": Class: " + event.getClass().getSimpleName() +
                    ";\t    Name: " + event.getName() + ";\t\t Audience: " + event.getAudience());
        }  // while
        System.out.println();

        System.out.println("Statistics of audiences (all events): ");
        System.out.println("All Events: \t" + "Count: " + Event.getNumberOfObjects() + "; \t\t Sum: " +
                audienceSum + ";\t Average: " + average.intValue() + ";  Max: " + max(list) + ";\t\t Min: " +
                min(list) + "\n");

        System.out.println("Number of most popular events: " + maxCount(list));

        System.out.println("Most popular events (sorted by name): ");

        System.out.println("\nEvents (sorted by class name then by name):" );

        System.out.println("\nStatistics of audience (by event class name): ");

        ArrayList<String> names = new ArrayList<>();
        names.add(soccerGame.getName());
        names.add(basketBallGame.getName());
        names.add(concert.getName());
        names.add(orchestra.getName());
        names.add(soccerGame1.getName());
        names.add(concert1.getName());
        names.add(art.getName());
        Collections.sort(names);
        String formattedNames = names.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println("Sorted names: " + formattedNames);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        } //for()
        return max;
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {

        E min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        } //for()
        return min;
    }
    public static <E extends Comparable<E>> int maxCount(ArrayList<E> list){
        E max = list.get(0);
        int maxCount =0;
        for(int i = 1; i< list.size();i++){
            if(max.compareTo(list.get(i)) < 0){
                maxCount++;
            }
        }
        return maxCount;
    }
}