package chapter15;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import chapter15.ClockPane;

public class DisplayClock extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane();

        String timeString     = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label  lblCurrentTime = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);           // Place the scene in the stage

        primaryStage.setTitle("DisplayClock");  // Set the stage title
        primaryStage.show();                    // Display the stage

    }  // start()

}  // class DisplayClock
