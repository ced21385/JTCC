package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import chapter16.DescriptionPane;

public class ComboBoxDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    // parallel arrays
    private final String   [] flagTitles      = {"Canada", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom", "United States of America"};
    private final ImageView[] flagImage       = {new ImageView("image/ca.gif"), new ImageView("image/denmark.gif"), new ImageView("image/fr.gif"), new ImageView("image/germany.gif"), new ImageView("image/india.gif"), new ImageView("image/norway.gif"), new ImageView("image/uk.gif"), new ImageView("image/us.gif")};
    private final String   [] flagDescription = {"Canadian national flag", "Denmark national flag", "France national flag", "Germany national flag", "India national flag", "Norway national flag", "UK national flag", "US national flag"};

    private final DescriptionPane descriptionPane = new DescriptionPane();

    private final ComboBox<String> cbo = new ComboBox<>();

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        cbo.setPrefWidth(400);

        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft  (new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);

        BorderPane pane = new BorderPane();
        pane.setTop   (paneForComboBox     );
        pane.setCenter(descriptionPane);

        cbo.setValue(flagTitles[0]);  // Canada
        setDisplay(items.indexOf(cbo.getValue()));  // Canada

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.setTitle("ComboBoxDemo");  // Set the stage title
        primaryStage.show();                    // Display the stage

    }  // start()

    public void setDisplay(int index) {
        descriptionPane.setTitle      (flagTitles     [index]);
        descriptionPane.setImageView  (flagImage      [index]);
        descriptionPane.setDescription(flagDescription[index]);
    }  // setDisplay()

}  // class ComboBoxDemo