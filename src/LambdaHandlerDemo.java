package chapter15;

import java.lang.String;
import java.lang.System;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Button btNew   = new Button("New"  );
        Button btOpen  = new Button("Open" );
        Button btSave  = new Button("Save" );
        Button btPrint = new Button("Print");

        btNew  .setOnAction((ActionEvent e) -> {System.out.println("Process New"  );});  // declared type
        btOpen .setOnAction((e)             -> {System.out.println("Process Open" );});  // inferred type
        btSave .setOnAction( e              -> {System.out.println("Process Save" );});  // single inferred type
        btPrint.setOnAction( e              ->  System.out.println("Process Print")  );  // single statment

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        Scene scene = new Scene(hBox, 300, 50);
        primaryStage.setScene(scene);                // Place the scene in the stage
        primaryStage.setTitle("LambdaHandlerDemo");  // Set title
        primaryStage.show();                         // Display the stage

    }  // start()

}  // class LambdaHandlerDemo