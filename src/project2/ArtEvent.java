package project2;

import java.util.Date;
import project2.Event;

public class ArtEvent extends Event {

    String type;
    private static int NumberOfObjects = 0;

    public ArtEvent(String name, String place, Date dateTime, int audience, String type){
        super(name, place, dateTime, audience);
        this.setNumberOfObjects();
        this.setType(type);
    }

    public static void setNumberOfObjects(){
        NumberOfObjects+= 1;
    }

    public static int getNumberOfObjects(){
        return NumberOfObjects;
    }



    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}
