package project4;

import javafx.scene.layout.GridPane;
import project4.ArtEvent;
import project4.BasketBallGame;
import project4.Concert;
import project4.Event;
import project4.MusicEvent;
import project4.Orchestra;
import project4.SoccerGame;
import project4.SportEvent;
import project4.ArtEventPane;
import project4.BasketBallGamePane;
import project4.ConcertPane;
import project4.OrchestraPane;
import project4.SoccerGamePane;
import project4.Weather;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.ListChangeListener;

public class tryout extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        ArtEventPane art = new ArtEventPane();
       // BasketBallGamePane bb = new BasketBallGamePane();
        OrchestraPane o = new OrchestraPane();
        SoccerGamePane s = new SoccerGamePane();
        Pane pane = s.getSoccerPane();


        Scene scene = new Scene(pane,650,400);
        primaryStage.setTitle("TestEventGUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
