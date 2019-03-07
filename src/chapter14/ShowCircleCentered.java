package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.appliction.Application.start()
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.centerXProperty().bind(pane.widthProperty() .divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setStroke(Color.BLACK);
        circle.setFill  (Color.YELLOW);

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 400, 200);

        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();

    }  // start()

}  // class ShowCircle