package project5;

import java.util.ArrayList;
import java.lang.String;

public class Event {

    private String name;
    private int audience;
    private static ArrayList<Event> eventList = new ArrayList<>();
    private static int numberOfObjects = 0;

    protected Event(){ Event.numberOfObjects++;}

    protected Event(String name, int audience){
        this.setName(name);
        this.setAudience(audience);
        eventList.add(this);
        Event.numberOfObjects++;
    }

    public final void setName(String name){ this.name = name; }
    public String getName(){ return this.name; }

    public final void setAudience(int audience){ this.audience = audience; }
    public int getAudience(){ return this.audience; }

    public static int getNumberOfObjects(){ return Event.numberOfObjects; }

    public static ArrayList getEventList(){ return eventList;}

   // @Override  // java.lang.Object.toString()
    //public String toString() {return "[class = " + this.getClass().getSimpleName() + ", name = " + this.getName() + ", audience = " + this.getAudience() + "]";}

}
