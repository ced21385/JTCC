package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class SliderDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}


    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Text text = new Text(20, 20, "JavaFX Programming");

        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks (true);

        Slider slVertical = new Slider();
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickLabels(true);
        slVertical.setShowTickMarks (true);
        slVertical.setValue(100);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText );
        pane.setBottom(slHorizontal);
        pane.setRight (slVertical  );

        slHorizontal.valueProperty().addListener(ov -> text.setX(slHorizontal.getValue() * paneForText.getWidth() / slHorizontal.getMax()));
        slVertical  .valueProperty().addListener(ov -> text.setY((slVertical.getMax() - slVertical.getValue()) * paneForText.getHeight() / slVertical.getMax()));

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setScene(scene);         // Place the scene in the stage

        primaryStage.setTitle("SliderDemo");  // Set the stage title
        primaryStage.show();                  // Display the stage

    }  // start()

}  // class SliderDemo
