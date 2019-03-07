package chapter15;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import chapter15.OkHandlerClass;
import chapter15.CancelHandlerClass;

public class HandleEvent extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Appliation.start()
    public void start(Stage primaryStage) {

        Button btnOK = new Button("OK");                         // event source
        OkHandlerClass handler1 = new OkHandlerClass();          // create handler
        btnOK.setOnAction(handler1);                             // register handler object

        Button btnCancel = new Button("Cancel");                 // event source
        CancelHandlerClass handler2 = new CancelHandlerClass();  // create handler
        btnCancel.setOnAction(handler2);                         // register handler object

        HBox pane = new HBox(10.0);  // layout pane
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(btnOK, btnCancel);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);          // place the scene in the stage
        primaryStage.setTitle("HandleEvent");  // set the stage title
        primaryStage.show();                   // display the stage

    }  // start()

}  // class HandleEvent