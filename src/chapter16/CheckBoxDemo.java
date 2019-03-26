package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import chapter16.ButtonDemo;

public class CheckBoxDemo extends ButtonDemo {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // chapter16.ButtonDeom.getPane()
    protected BorderPane getPane() {

        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD  , FontPosture.ITALIC , 20);
        Font fontBold       = Font.font("Times New Roman", FontWeight.BOLD  , FontPosture.REGULAR, 20);
        Font fontItalic     = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC , 20);
        Font fontNormal     = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        super.text.setFont(fontNormal);

        CheckBox chkBold   = new CheckBox("Bold"  );
        CheckBox chkItalic = new CheckBox("Italic");

        EventHandler<ActionEvent> handler = e -> {
            if (chkBold  .isSelected() && chkItalic.isSelected()) {super.text.setFont(fontBoldItalic);}  // Both check boxes checked
            else if (chkBold  .isSelected()) {super.text.setFont(fontBold  );}  // The Bold check box checked
            else if (chkItalic.isSelected()) {super.text.setFont(fontItalic);}  // The Italic check box checked
            else                             {super.text.setFont(fontNormal);}  // Both check boxes unchecked
        };

        chkBold  .setOnAction(handler);
        chkItalic.setOnAction(handler);

        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");

        BorderPane pane = super.getPane();
        pane.setRight(paneForCheckBoxes);

        return pane; // Return a new pane

    }  // getPane()

    @Override  // chapter16.ButtonDemo.start()
    public void start(Stage primaryStage) {super.start(primaryStage);}

}  // class CheckBoxDemo