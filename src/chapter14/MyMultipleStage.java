package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyMultipleStage extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Button btOK  = new Button("OK");

        Scene scene1 = new Scene(btOK, 300, 100);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Primary Stage");
        primaryStage.setResizable(false);
        primaryStage.show();

        Button btNewStage = new Button("New Stage");

        Scene scene2 = new Scene(btNewStage, 100, 300);

        Stage secondaryStage = new Stage();
        secondaryStage.setScene(scene2);
        secondaryStage.setTitle("Second Stage");
        secondaryStage.show();

    }  // start()

}  // class MyMultipleStage