package chapter15;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import chapter15.CirclePane;

public class ControlCircleWithMouseAndKey extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        CirclePane circlePane = new CirclePane();

        Button btEnlarge = new Button("Enlarge");
        Button btShrink  = new Button("Shrink" );

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btEnlarge, btShrink);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        btEnlarge.setOnAction(e -> circlePane.enlargeCircle());
        btShrink .setOnAction(e -> circlePane.shrinkCircle ());

        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY  ) circlePane.enlargeCircle();
            else if (e.getButton() == MouseButton.SECONDARY) circlePane.shrinkCircle ();
        });

        Scene scene = new Scene(borderPane, 200, 150);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP  ) circlePane.enlargeCircle();
            else if (e.getCode() == KeyCode.DOWN) circlePane.shrinkCircle ();
        });

        primaryStage.setScene(scene);            // Place the scene in the stage
        primaryStage.setTitle("ControlCircle");  // Set the stage title
        primaryStage.show();                     // Display the stage

    }  // start()

}  // class ControlCircleWithMouseAndKey