package project5;

import project5.MusicEvent;
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;

public class Orchestra extends MusicEvent {

    private static int numberOfObjects = 0;

    public Orchestra(String name, int audience) throws ParseException{
        super(name, audience);
        Orchestra.numberOfObjects++;

    }

    public static int getNumberOfObjects(){ return Orchestra.numberOfObjects;}

}
