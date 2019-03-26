package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import chapter16.CheckBoxDemo;

public class RadioButtonDemo extends CheckBoxDemo {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // chapter16.CheckBoxDemo.getPane()
    protected BorderPane getPane() {

        RadioButton rbRed   = new RadioButton("Red"  );
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue  = new RadioButton("Blue" );

        ToggleGroup group = new ToggleGroup();
        rbRed  .setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue .setToggleGroup(group);

        rbRed  .setOnAction(e -> {if (rbRed  .isSelected()) {super.text.setFill(Color.RED  );}});
        rbGreen.setOnAction(e -> {if (rbGreen.isSelected()) {super.text.setFill(Color.GREEN);}});
        rbBlue .setOnAction(e -> {if (rbBlue .isSelected()) {super.text.setFill(Color.BLUE );}});

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-color: green");
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");
        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);

        BorderPane pane = super.getPane();
        pane.setLeft(paneForRadioButtons);

        return pane;

    }  // getPane()

    @Override  // chapter16.CheckBoxDemo.start()
    public void start(Stage primaryStage) {super.start(primaryStage);}

}  // class RadioButtonDemo