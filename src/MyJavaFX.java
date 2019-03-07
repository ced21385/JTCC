package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

//    public MyJavaFX() {}  // no-arg constructor

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {  // instance method

        Button btOK = new Button("OK");

        Scene scene = new Scene(btOK, 300, 100);  // create a scene

        primaryStage.setTitle("MyJavaFX");  // Set the stage title
        primaryStage.setScene(scene);       // Place the scene on the stage
        primaryStage.show();                // Display the stage

    }  // start()

}  // class MyJavaFX
