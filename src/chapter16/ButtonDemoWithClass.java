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

public class ButtonDemoWithClass extends Application {

    private Text text = new Text(50, 50, "JavaFX Programming");  // instance variable

    public ButtonDemoWithClass() {}  // no-arg constructor

    private BorderPane getPane() {   // instance method

        Pane paneForText = new Pane();
        paneForText.getChildren().add(this.text);

        Button btLeft  = new Button("Left" , new ImageView("image/left.gif" ));
        Button btRight = new Button("Right", new ImageView("image/right.gif"));

        btLeft .setOnAction(e -> this.goLeft ());
        btRight.setOnAction(e -> this.goRight());

        HBox paneForButtons = new HBox(20);
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        pane.setCenter(paneForText);

        return pane;

    }  // getPane()

    private void goLeft () {this.text.setX(this.text.getX() - 10);}  // instance method
    private void goRight() {this.text.setX(this.text.getX() + 10);}  // instance method

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ButtonDemoWithClass buttonDemo = new ButtonDemoWithClass();

        Scene scene = new Scene(buttonDemo.getPane(), 450, 200);
        primaryStage.setScene(scene);         // Place the scene in the stage
        primaryStage.setTitle("ButtonDemo");  // Set the stage title
        primaryStage.show();                  // Display the stage

    }  // start()

    public static void main(String[] args) {Application.launch(args);}

}  // class ButtonDemo