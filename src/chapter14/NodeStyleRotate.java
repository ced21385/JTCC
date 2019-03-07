package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotate extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");

        StackPane pane = new StackPane();
        pane.getChildren().add(btOK);

        pane.setRotate(45.0);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 400, 200);

        primaryStage.setTitle("NodeStyleRotate");
        primaryStage.setScene(scene);
        primaryStage.show();

    }  // start()

}  // class NodeStyleRotate
