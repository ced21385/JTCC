package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Pane pane = new StackPane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));

        pane.getChildren().add(circle);

        Label label1 = new Label("JavaFX");
        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        pane.getChildren().add(label1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("FontDemo");  // Set the stage title
        primaryStage.setScene(scene);       // Place the scene in the stage
        primaryStage.show();                // Display the stage

    }  // start()

}  // class FontDemo
