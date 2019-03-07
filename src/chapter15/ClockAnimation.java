package chapter15;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;
import chapter15.ClockPane;

public class ClockAnimation extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane();

        EventHandler<ActionEvent> eventHandler = e -> clock.setCurrentTime();

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));  // animation

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clock, 250, 250);
        primaryStage.setScene(scene);             // Place the scene in the stage

        primaryStage.setTitle("ClockAnimation");  // Set the stage title
        primaryStage.show();                      // Display the stage

    }  // start()

}  // class ClockAnimation
