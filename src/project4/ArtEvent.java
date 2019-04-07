package project4;

import project4.Event;
import java.text.ParseException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class ArtEvent  extends Event {

        private String type;
        private static int numberOfObjects = 0;


        protected ArtEvent(String name, String place, Date dateTime, int audience,
                           String type) throws ParseException {
            super(name, place, dateTime, audience);
            this.setType(type);
            project4.ArtEvent.numberOfObjects++;
        }
        public final void setType(String type){ this.type = type; }
        public String getType(){ return this.type;}

        public static int getNumberOfObjects(){ return project4.ArtEvent.numberOfObjects++;}

        @Override
        public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}
