package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class ListViewDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    // parallel arrays
    private final String   [] flagTitles = {"Canada", "Denmark", "France", "Close"};
    private final ImageView[] imageViews = {new ImageView("image/ca.gif"), new ImageView("image/denmark.gif"), new ImageView("image/fr.gif")};

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        ListView<String> lv = new ListView<>(items);

        lv.setPrefSize(200, 200);
        lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        FlowPane imagePane = new FlowPane(10, 10);

        BorderPane pane = new BorderPane();
        pane.setLeft  (new ScrollPane(lv));
        pane.setCenter(imagePane);

        imagePane.getChildren().add(imageViews[0]);

        lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
            for (int i: lv.getSelectionModel().getSelectedIndices())
            {
                if (i == flagTitles.length - 1) primaryStage.close();
                else {
                    imagePane.getChildren().clear();
                    imagePane.getChildren().add(imageViews[i]);
                }  // else
            }  // for
        });  // addListener

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.setTitle("ListViewDemo");  // Set the stage title
        primaryStage.show();                    // Display the stage

    }  // start()

}  // class ListViewDemo