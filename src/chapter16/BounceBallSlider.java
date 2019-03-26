package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import chapter16.BallPane;

public class BounceBallSlider extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Slider   slSpeed  = new Slider();
        slSpeed.setMax(20);

        BallPane ballPane = new BallPane();
        ballPane.rateProperty().bind(slSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(slSpeed );

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.setTitle("BounceBallSlider");  // Set the stage title
        primaryStage.show();                        // Display the stage

    }  // start()

}  // class BounceBallSlider