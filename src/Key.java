package chapter15;

import java.lang.String;
import java.lang.Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Key extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Text text = new Text(20, 20, "A");

        Pane pane = new Pane();
        pane.getChildren().add(text);

        text.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:  text.setY(text.getY() + 10); break;
                case UP:    text.setY(text.getY() - 10); break;
                case LEFT:  text.setX(text.getX() - 10); break;
                case RIGHT: text.setX(text.getX() + 10); break;
                default:    if (Character.isLetterOrDigit(e.getText().charAt(0))) text.setText(e.getText());
            }  // switch
        });

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);           // place the scene in the stage
        primaryStage.setTitle("KeyEventDemo");  // set the stage title
        primaryStage.show();                    // display the stage

        text.requestFocus();  // text is focused to receive key input

    }  // start()

}  // class Key