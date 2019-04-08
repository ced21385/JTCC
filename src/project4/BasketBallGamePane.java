package project4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.ToggleGroup;
import project4.SportEvent;
import javafx.event.ActionEvent;
import java.util.Date;
import java.text.ParseException;
import java.util.Arrays;

public class BasketBallGamePane extends Pane{

    BasketBallGamePane() {
    }

    private TextField eventName = new TextField();
    private TextField eventDate = new TextField();
    private TextField audience = new TextField();
    private TextField team1 = new TextField();
    private TextField team2 = new TextField();
    private Button clear = new Button("Clear");
    private TextField winner = new TextField();
    private TextField place = new TextField();
    private TextField time = new TextField();
    private TextField league = new TextField();
    private TextField score1 = new TextField();
    private TextField score2 = new TextField();
    private Button submit = new Button("Submit");

    private RadioButton weekend = new RadioButton("Yes");
    private RadioButton weekday = new RadioButton("No");
    private final ToggleGroup radioGroup = new ToggleGroup();

    private Pane BasketBallPane;
    private GridPane gridPane = new GridPane();
    private HBox radioGroupPane = new HBox();

    {
        weekend.setToggleGroup(radioGroup);
        weekday.setToggleGroup(radioGroup);
        weekend.setDisable(true);
        weekday.setDisable(true);
        weekend.setOpacity(100);
        weekday.setOpacity(100);
        radioGroupPane.getChildren().addAll(weekend, weekday);
        radioGroupPane.setSpacing(25);
        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(eventName, 1, 0);
        gridPane.add(eventDate, 1, 1);
        gridPane.add(audience, 1, 2);
        gridPane.add(team1, 1, 3);
        gridPane.add(team2, 1, 4);
        gridPane.add(clear, 0, 5);
        gridPane.add(winner, 1, 6);
        gridPane.add(radioGroupPane, 1, 7);

        gridPane.add(place, 3, 0);
        gridPane.add(time, 3, 1);
        gridPane.add(league, 3, 2);
        gridPane.add(score1, 3, 3);
        gridPane.add(score2, 3, 4);
        gridPane.add(submit, 2, 5);

        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(new Label("Date (mm/dd/yyyy):"), 0, 1);
        gridPane.add(new Label("Audience:"), 0, 2);
        gridPane.add(new Label("Team 1:"), 0, 3);
        gridPane.add(new Label("Team 2:"), 0, 4);
        gridPane.add(new Label("Winner:"), 0, 6);
        gridPane.add(new Label("Weekend:"), 0, 7);

        gridPane.add(new Label("Place:"), 2, 0);
        gridPane.add(new Label("Time (hh:mm)"), 2, 1);
        gridPane.add(new Label("League:"), 2, 2);
        gridPane.add(new Label("Score 1:"), 2, 3);
        gridPane.add(new Label("Score 2:"), 2, 4);

        eventName.setAlignment(Pos.BOTTOM_RIGHT);
        eventDate.setAlignment(Pos.BOTTOM_RIGHT);
        audience.setAlignment(Pos.BOTTOM_RIGHT);
        team1.setAlignment(Pos.BOTTOM_RIGHT);
        team2.setAlignment(Pos.BOTTOM_RIGHT);
        time.setAlignment(Pos.BOTTOM_RIGHT);
        winner.setAlignment(Pos.BOTTOM_RIGHT);
        place.setAlignment(Pos.BOTTOM_RIGHT);
        league.setAlignment(Pos.BOTTOM_RIGHT);
        score1.setAlignment(Pos.BOTTOM_RIGHT);
        score2.setAlignment(Pos.BOTTOM_RIGHT);

        BasketBallPane = gridPane;

        submit.setOnAction((ActionEvent e)-> {
            Date temp = new Date(eventDate.getText() + " " + time.getText());
            boolean weknd = Week.isWeekEnd(temp);

            SportEvent bballEvent = new SportEvent(super.toString());
            if (Week.isWeekEnd(temp)) {
                weekend.setSelected(true);
            } else if (Week.isWeekDay(temp)) {
                weekday.setSelected(true); }
            Event.getEventList().add(bballEvent);
        });

        clear.setOnAction((ActionEvent e)->{
            eventName.clear();
            eventDate.clear();
            place.clear();
            audience.clear();
            time.clear();
            score1.clear();
            score2.clear();
            team1.clear();
            team2.clear();
            league.clear();
            winner.clear();
            weekend.setSelected(false);
            weekday.setSelected(false);
            });
    }



    Pane getBasketBallPane() {
        return BasketBallPane;
    }
}

