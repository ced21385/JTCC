package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Button btOK = new Button("OK");    // UI control

//        btOK.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override  // javafx.event.EventHandler.handle()
//            public void handle(ActionEvent event) {System.out.println("Hello");}
//        });

        Pane pane = new StackPane();   // parent
        pane.getChildren().add(btOK);  // javafx.collections.ObserableList<E>
        pane.setRotate(45);

        Scene scene = new Scene(pane, 200, 100);
        scene.setFill(Color.RED);

        primaryStage.setTitle("Button in a pane");  // Set the stage title
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.show();                        // Display the stage

    }  // start()

}  // class ButtonInPane
