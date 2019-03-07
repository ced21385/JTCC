package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class ShowBorderPane extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Label l1 = new Label("Top"   );
        Label l2 = new Label("Left"  );
        Label l3 = new Label("Center");
        Label l4 = new Label("Right" );
        Label l5 = new Label("Bottom");

        BorderPane pane = new BorderPane();

        pane.setTop(l1);
        pane.setLeft(l2); pane.setCenter(l3); pane.setRight(l4);
        pane.setBottom(l5);

        BorderPane.setAlignment(l1, Pos.CENTER);
        BorderPane.setAlignment(l2, Pos.CENTER);
        BorderPane.setAlignment(l3, Pos.CENTER);
        BorderPane.setAlignment(l4, Pos.CENTER);
        BorderPane.setAlignment(l5, Pos.CENTER);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("ShowBorderPane");
        primaryStage.show();

    }  // start()

}  // class ShowBorderPane