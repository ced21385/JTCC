package project2;

import java.util.Date;
import project2.Event;
import java.lang.String;
import java.text.ParseException;

public final class ArtEvent extends Event {

    private String type;
    private static int numberOfObjects = 0;

    public ArtEvent(String name, String place, Date dateTime, int audience, String type) throws ParseException{
        super(name, place, dateTime, audience);
        ArtEvent.numberOfObjects++;
        this.setType(type);
    }


    public static int getNumberOfObjects(){
        return ArtEvent.numberOfObjects;
    }


    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}
}
