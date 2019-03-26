package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemoWithoutClass extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {
        Scene scene = new Scene(ButtonDemoWithoutClass.getPane(), 450, 200);
        primaryStage.setScene(scene);         // Place the scene in the stage
        primaryStage.setTitle("ButtonDemo");  // Set the stage title
        primaryStage.show();                  // Display the stage
    }  // start()

    public static BorderPane getPane() {      // static method

        Text text = new Text(50, 50, "JavaFX Programming");

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        Button btLeft  = new Button("Left" , new ImageView("image/left.gif" ));
        Button btRight = new Button("Right", new ImageView("image/right.gif"));

        btLeft .setOnAction(e -> ButtonDemoWithoutClass.goLeft (text));
        btRight.setOnAction(e -> ButtonDemoWithoutClass.goRight(text));

        HBox paneForButtons = new HBox(20);
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(paneForButtons);

        return pane;

    }  // getPane()

    public static void goLeft (Text text) {text.setX(text.getX() - 10);}  // static method
    public static void goRight(Text text) {text.setX(text.getX() + 10);}  // static method

}  // class ButtonDemoWithoutClass