package chapter15;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Text text = new Text(20, 20, "Programming is fun");

        Pane pane = new Pane();
        pane.getChildren().addAll(text);

        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setScene(scene);             // Place the scene in the stage
        primaryStage.setTitle("MouseEventDemo");  // Set the stage title
        primaryStage.show();                      // Display the stage

    }  // start()

}  // class MouseEventDemo