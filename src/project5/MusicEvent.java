package project5;

import project5.Event;
import java.text.ParseException;
import java.io.DataOutputStream;
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

    public class MusicEvent extends Event {

        private static int numberOfObjects = 0;

        protected MusicEvent(){ MusicEvent.numberOfObjects++;}

        protected MusicEvent(String name, int audience)
                throws ParseException {
            super(name, audience);
            MusicEvent.numberOfObjects++;
        }
        public static int getNumberOfObjects(){ return MusicEvent.numberOfObjects;}

    }
