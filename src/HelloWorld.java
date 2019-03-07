package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Button btn = new Button("Say 'Hello World'");

        btn.setOnAction  // create and register the event handler
                (new EventHandler<ActionEvent>()
                 {  @Override  // javafx.event.EventHandler.handle()
                 public void handle(ActionEvent event) {System.out.println("Hello World!");}
                 }  // handle()
                );

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 200, 100);

        primaryStage.setTitle("Hello World!");  // Set the stage title
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.show();                    // Display the stage

    }  // start()

}  // class HelloWorld
