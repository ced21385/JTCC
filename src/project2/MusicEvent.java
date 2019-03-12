package project2;

import java.util.Arrays;
import java.util.Date;

public class MusicEvent extends Event {

    private String[] performers;
    private static int NumberOfObjects = 0;

    public MusicEvent(String name, String place, Date dateTime, int audience, String[] performers){

        super (name, place, dateTime, audience);
        this.setPerformers(performers);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        NumberOfObjects+= 1;
    }

    public static int getNumberOfObjects(){
        return NumberOfObjects;
    }



    public String[] getPerformers() {
        return performers;
    }

    public void setPerformers(String[] performers){
        this.performers=performers;
    }

    @Override
    public String toString(){
        return String.format("%s [performers = %s]", super.toString(), Arrays.toString(this.getPerformers()) );
    }

}
