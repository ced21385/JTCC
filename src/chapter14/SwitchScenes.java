package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScenes extends Application {

    public static void main(String[] args) {Application.launch(args);}

    Scene scene1, scene2;

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Label label1 = new Label("This is the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 100);

        Label label2 = new Label("This is the second scene");
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 400, 200);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("SwitchScenes");
        primaryStage.show();

    }  // start()

}  // class SwitchScenes