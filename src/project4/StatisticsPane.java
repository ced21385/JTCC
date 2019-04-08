package project4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import project4.ArtEvent;
import javafx.event.ActionEvent;
import java.util.Date;
import java.text.ParseException;
import javafx.scene.text.Font;

public class StatisticsPane extends Pane{
    StatisticsPane(){}

    private TextField events = new TextField();
    private TextField sportE = new TextField();
    private TextField soccer = new TextField();
    private TextField concerts = new TextField();
    private Button clear = new Button("Clear");

    private TextField music = new TextField();
    private TextField bball = new TextField();
    private TextField orchestra = new TextField();
    private Button count = new Button("Count");

    private TextField art = new TextField();

    private TextArea area = new TextArea();

    private Pane StatisticsPane;
    private GridPane gridPane = new GridPane();
    {
        area.setEditable(false);
        area.setWrapText(true);
        area.setFont(new Font("Times New Roman",12));
        area.setPrefSize(750,200);
        gridPane.add(area,0,6,6,6);
        area.insertText(0,Event.getEventList().toString());

        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(events,1,0);
        gridPane.add(sportE,1,1);
        gridPane.add(soccer,1,2);
        gridPane.add(concerts,1,3);
        gridPane.add(clear,0,4);

        gridPane.add(music,3,1);
        gridPane.add(bball,3,2);
        gridPane.add(orchestra,3,3);
        gridPane.add(count,2,4);

        gridPane.add(art,5,1);

        gridPane.add(new Label("Events:"),0,0);
        gridPane.add(new Label("Sport Events:"),0,1);
        gridPane.add(new Label("Soccer Games:"),0,2);
        gridPane.add(new Label("Concerts:"),0,3);

        gridPane.add(new Label("Music Events:"),2,1);
        gridPane.add(new Label("Basketball Games:"),2,2);
        gridPane.add(new Label("Orchestras:"),2,3);

        gridPane.add(new Label("Art Events:"),4,1);

        events.setAlignment(Pos.BOTTOM_RIGHT);
        sportE.setAlignment(Pos.BOTTOM_RIGHT);
        soccer.setAlignment(Pos.BOTTOM_RIGHT);
        concerts.setAlignment(Pos.BOTTOM_RIGHT);
        music.setAlignment(Pos.BOTTOM_RIGHT);
        bball.setAlignment(Pos.BOTTOM_RIGHT);
        orchestra.setAlignment(Pos.BOTTOM_RIGHT);
        art.setAlignment(Pos.BOTTOM_RIGHT);

        StatisticsPane = gridPane;

        count.setOnAction((ActionEvent e)->{
            area.insertText(0,Event.getEventList().toString());

        });

        clear.setOnAction((ActionEvent e)->{
            events.clear();
            sportE.clear();
            soccer.clear();
            concerts.clear();
            music.clear();
            bball.clear();
            orchestra.clear();
            art.clear();
        });
    }

    public static void getNumberOfObjects() {
        System.out.println("Events: "           + Event.getNumberOfObjects());
        System.out.println("Sport Events: "     + SportEvent.getNumberOfObjects());
        System.out.println("Music Events: "     + MusicEvent.getNumberOfObjects());
        System.out.println("Art Events: "       + ArtEvent.getNumberOfObjects());
        System.out.println("Soccer Games: "     + SoccerGame.getNumberOfObjects());
        System.out.println("Basketball Games: " + BasketBallGame.getNumberOfObjects());
        System.out.println("Concerts: "         + Concert.getNumberOfObjects());
        System.out.println("Orchestras: "       + Orchestra.getNumberOfObjects());
    }  // getNumberOfObjects()

    Pane getStatistics(){return StatisticsPane;}
}
