package project4;

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

import java.text.ParseException;
import java.util.Iterator;

public class TestEventGUI extends Application  {

    public TestEventGUI() throws ParseException {
    }

    public static void main(String[] args){launch(args);}

    private final String[] titles = { "Art Event","Basketball Game","Concert",
            "Orchestra","Soccer Game","Statistics","Close"};
    private  Pane[] displayPanes = new Pane[]{ new ArtEventPane().getArtPane(),
                        new BasketBallGamePane().getBasketBallPane(), new ConcertPane().getConcertPane(),
                        new OrchestraPane().getOrchestraPane(),new SoccerGamePane().getSoccerPane(),
                        new StatisticsPane().getStatistics()};

    @Override
    public void start(Stage primaryStage) {
        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(titles));
        lv.setPrefSize(200,450);
        lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


        StackPane stack = new StackPane();
        ScrollPane scroll = new ScrollPane(lv);
        lv.setPadding(new Insets(0,0,0,0));
        HBox pane = new HBox();
        pane.getChildren().addAll(scroll, stack);


        lv.getSelectionModel().getSelectedIndices().addListener(
                (ListChangeListener<? super Integer>) e -> {
                    stack.getChildren().removeAll(displayPanes);

                    if(lv.getSelectionModel().getSelectedItem().equals("Art Event")){
                        stack.getChildren().add(displayPanes[0]);
                    }
                    else if(lv.getSelectionModel().getSelectedItem().equals("Basketball Game")){
                        stack.getChildren().add(displayPanes[1]);
                    }
                    else if(lv.getSelectionModel().getSelectedItem().equals("Concert")){
                        stack.getChildren().add(displayPanes[2]);
                    }
                    else if(lv.getSelectionModel().getSelectedItem().equals("Orchestra")){
                        stack.getChildren().add(displayPanes[3]);
                    }
                    else if(lv.getSelectionModel().getSelectedItem().equals("Soccer Game")){
                        stack.getChildren().add(displayPanes[4]);
                    }
                    else if(lv.getSelectionModel().getSelectedItem().equals("Statistics")){
                        stack.getChildren().add(displayPanes[5]);
                    }
                    else { System.exit(0); }
                }
        );
        Iterator<Event> eventListIterator = project4.Event.getEventList().iterator();
        project4.Event event;
        int   eventNumber;
        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = project4.Event.getEventList().indexOf(event) + 1;
            String hold = ("\nEvent: " + String.valueOf(eventNumber) +
                    ": Class: " + event.getClass().getSimpleName() + ",\tEvent Name: " + event.getName());
        }// while

        Scene scene = new Scene(pane,1050,400);
        primaryStage.setTitle("TestEventGUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
