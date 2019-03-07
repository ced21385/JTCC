
package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));

        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);

        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());

        Scene scene = new Scene(pane, 200, 250);

        primaryStage.setTitle("ShowFlowPane");  // Set the stage title
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.show();                    // Display the stage

    }  // start()

}  // class ShowFlowPane