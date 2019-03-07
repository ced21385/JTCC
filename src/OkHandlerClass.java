package chapter15;

import java.lang.System;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OkHandlerClass implements EventHandler<ActionEvent> {

    @Override  // javafx.event.EventHandler.handle()
    public void handle(ActionEvent e) {
        System.out.println("event class: "  + e.getClass    ());
        System.out.println("event source: " + e.getSource   ());
        System.out.println("event type: "   + e.getEventType());
        System.out.println("OK button clicked");
        System.out.println();
    }  // handle()

}  // class OkHandlerClass
