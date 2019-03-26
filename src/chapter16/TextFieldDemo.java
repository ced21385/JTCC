package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import chapter16.RadioButtonDemo;

public class TextFieldDemo extends RadioButtonDemo {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // chapter16.RadioButtonDemo.getPane()
    protected BorderPane getPane() {

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        tf.setOnAction(e -> super.text.setText(tf.getText()));

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");

        paneForTextField.setLeft(new Label("Enter a new message: "));
        paneForTextField.setCenter(tf);

        BorderPane pane = super.getPane();
        pane.setTop(paneForTextField);

        return pane;

    }  // getPane()

    @Override  // chapter16.RadioButtonDemo.start()
    public void start(Stage primaryStage) {super.start(primaryStage);}

}  // class TextFieldDemo