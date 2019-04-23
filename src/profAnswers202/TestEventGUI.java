package profAnswers202;
//project04
import java.lang.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import profAnswers202.SoccerGamePane;
import profAnswers202.BasketBallGamePane;
import profAnswers202.ConcertPane;
import profAnswers202.OrchestraPane;
import profAnswers202.ArtEventPane;
import profAnswers202.StatisticsPane;

public class TestEventGUI extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        String[] titles       = {"Soccer Game", "Basketball Game", "Concert", "Orchestra", "Art Event", "Statistics", "Close"};
        Pane  [] displayPanes = {new SoccerGamePane(), new BasketBallGamePane(), new ConcertPane(), new OrchestraPane(), new ArtEventPane(), new StatisticsPane()};

        ObservableList<String> items = FXCollections.observableArrayList(titles);
        ListView<String> listView = new ListView<>(items);

        listView.setPrefSize(150, 400);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        Pane pane = new Pane();
        pane.getChildren().add(displayPanes[0]);
        pane.setPadding (new Insets(5, 5, 5, 5));

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft  (new ScrollPane(listView));
        borderPane.setCenter(pane);

        listView.getSelectionModel().selectedItemProperty().addListener(ov -> {
            for (int i: listView.getSelectionModel().getSelectedIndices()) {
                if (i == displayPanes.length) primaryStage.close();
                else {
                    pane.getChildren().clear();
                    pane.getChildren().add(displayPanes[i]);
                }  // else
            }  // for
        });  // addListener

        Scene scene = new Scene(borderPane, 450, 170);
        primaryStage.setScene(scene);           // place the scene in the stage
        primaryStage.setTitle("TestEventGUI");  // set the stage title
        primaryStage.show();                    // display the stage

    }  // start()

}  // class TestEventGUI
