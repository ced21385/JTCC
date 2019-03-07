package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Label label1 = new Label("First Name:");
        Label label2 = new Label("MI:"        );
        Label label3 = new Label("Lastt Name:");

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();

        GridPane pane = new GridPane();

//        pane.setHgap(10.0);
//        pane.setVgap( 5.0);

        pane.add(label1, 0, 0); pane.add(textField1, 1, 0);
        pane.add(label2, 0, 1); pane.add(textField2, 1, 1);
        pane.add(label3, 0, 2); pane.add(textField3, 1, 2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }  // start()

}  // class ShowGridPane