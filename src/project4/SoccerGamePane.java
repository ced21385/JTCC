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

public class SoccerGamePane extends Pane{

    SoccerGamePane(){}

    private TextField eventName = new TextField();
    private TextField eventDate = new TextField();
    private TextField audience = new TextField();
    private TextField team1 = new TextField();
    private TextField team2 = new TextField();
    private TextField wind = new TextField();
    private Button clear = new Button("Clear");
    private TextField winner = new TextField();
    private TextField place = new TextField();
    private TextField time = new TextField();
    private TextField league = new TextField();
    private TextField score1 = new TextField();
    private TextField score2 = new TextField();
    private TextField temperature = new TextField();
    private TextField humidity = new TextField();
    private Button submit = new Button("Submit");

    private RadioButton weekend = new RadioButton("Yes");
    private RadioButton weekday = new RadioButton("No");
    private final ToggleGroup radioGroup = new ToggleGroup();

    private RadioButton sunny = new RadioButton("Yes");
    private RadioButton notSunny = new RadioButton("No");
    private final ToggleGroup sunnyGroup = new ToggleGroup();
    private HBox sunnyPane = new HBox();

    private RadioButton goodWeather = new RadioButton("Yes");
    private RadioButton bad = new RadioButton("No");
    private final ToggleGroup weatherGroup = new ToggleGroup();
    private HBox weatherPane = new HBox();

    private Pane SoccerPane;
    private GridPane gridPane = new GridPane();
    private HBox radioGroupPane = new HBox();

    {
        winner.setDisable(true);

        weekend.setToggleGroup(radioGroup);
        weekday.setToggleGroup(radioGroup);
        weekend.setDisable(true);
        weekday.setDisable(true);
        weekend.setOpacity(100);
        weekday.setOpacity(100);
        radioGroupPane.getChildren().addAll(weekend, weekday);
        radioGroupPane.setSpacing(25);

        sunny.setToggleGroup(sunnyGroup);
        notSunny.setToggleGroup(sunnyGroup);
        sunny.setDisable(false);
        notSunny.setDisable(false);
        sunny.setOpacity(100);
        notSunny.setOpacity(100);
        sunnyPane.getChildren().addAll(sunny,notSunny);
        sunnyPane.setSpacing(25);

        goodWeather.setToggleGroup(weatherGroup);
        bad.setToggleGroup(weatherGroup);
        goodWeather.setDisable(true);
        bad.setDisable(true);
        goodWeather.setOpacity(100);
        bad.setOpacity(100);
        weatherPane.getChildren().addAll(goodWeather,bad);
        weatherPane.setSpacing(25);

        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(eventName, 1, 0);
        gridPane.add(eventDate, 1, 1);
        gridPane.add(audience, 1, 2);
        gridPane.add(team1, 1, 3);
        gridPane.add(team2, 1, 4);
        gridPane.add(sunnyPane,1,5);
        gridPane.add(wind,1,6);
        gridPane.add(clear, 0, 7);
        gridPane.add(winner, 1, 8);
        gridPane.add(radioGroupPane, 1, 9);

        gridPane.add(place, 3, 0);
        gridPane.add(time, 3, 1);
        gridPane.add(league, 3, 2);
        gridPane.add(score1, 3, 3);
        gridPane.add(score2, 3, 4);
        gridPane.add(temperature,3,5);
        gridPane.add(humidity,3,6);
        gridPane.add(submit, 2, 7);
        gridPane.add(weatherPane,3,9);

        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(new Label("Date (mm/dd/yyyy):"), 0, 1);
        gridPane.add(new Label("Audience:"), 0, 2);
        gridPane.add(new Label("Team 1:"), 0, 3);
        gridPane.add(new Label("Team 2:"), 0, 4);
        gridPane.add(new Label("Sunny:"),0,5);
        gridPane.add(new Label("Wind Speed:"),0,6);
        gridPane.add(new Label("Winner:"), 0, 8);
        gridPane.add(new Label("Weekend:"), 0, 9);

        gridPane.add(new Label("Place:"), 2, 0);
        gridPane.add(new Label("Time (hh:mm)"), 2, 1);
        gridPane.add(new Label("League:"), 2, 2);
        gridPane.add(new Label("Score 1:"), 2, 3);
        gridPane.add(new Label("Score 2:"), 2, 4);
        gridPane.add(new Label("Temperature:"),2,5);
        gridPane.add(new Label("Humidity:"),2,6);
        gridPane.add(new Label("Good Weather:"),2,9);

        eventName.setAlignment(Pos.BOTTOM_RIGHT);
        eventDate.setAlignment(Pos.BOTTOM_RIGHT);
        audience.setAlignment(Pos.BOTTOM_RIGHT);
        team1.setAlignment(Pos.BOTTOM_RIGHT);
        team2.setAlignment(Pos.BOTTOM_RIGHT);
        wind.setAlignment(Pos.BOTTOM_RIGHT);
        place.setAlignment(Pos.BOTTOM_RIGHT);
        time.setAlignment(Pos.BOTTOM_RIGHT);
        league.setAlignment(Pos.BOTTOM_RIGHT);
        score1.setAlignment(Pos.BOTTOM_RIGHT);
        score2.setAlignment(Pos.BOTTOM_RIGHT);
        temperature.setAlignment(Pos.BOTTOM_RIGHT);
        humidity.setAlignment(Pos.BOTTOM_RIGHT);

        SoccerPane = gridPane;

        submit.setOnAction((ActionEvent e)-> {
            try {
                Date temp = new Date(eventDate.getText() + " " + time.getText());
                boolean weknd = Week.isWeekEnd(temp);
                String temps = team1.getText();
                String temps2 = team2.getText();
                String[] tempss = new String[]{temps,temps2};
                int scoretemp = Integer.parseInt(score1.getText());
                int scoretemp2 = Integer.parseInt(score2.getText());
                if (scoretemp > scoretemp2){
                     winner = team1;
                    winner.setAlignment(Pos.BOTTOM_RIGHT);
                    gridPane.add(new Label(team1.getText()),1,8);
                }
                else if(scoretemp2 > scoretemp){
                    winner = team2;
                    winner.setAlignment(Pos.BOTTOM_RIGHT);
                    gridPane.add(new Label(team2.getText()),1,8);
                }
                else{
                    if(Math.random() > .5){
                        winner = team1;
                        winner.setAlignment(Pos.BOTTOM_RIGHT);
                        gridPane.add(new Label(team1.getText()),1,8);
                    }
                }
                int[] scores = new int[] {scoretemp,scoretemp2};
                boolean sunny1 = false;
                if (sunny.hasProperties()){
                    sunny.setSelected(true);
                    sunny1 = true;
                }
                Double t = Double.parseDouble(temperature.getText());
                Double w = Double.parseDouble(wind.getText());
                Double h = Double.parseDouble(humidity.getText());
                Weather weather1 = new Weather(sunny1,t,w,h);
                if(t>=60 && t<=95 && w<=10 && h <.80&&h>=.40){ goodWeather.setSelected(true);}
                else{bad.setSelected(true);}

                SportEvent soccerGame = new SoccerGame(eventName.getText(), place.getText(), temp,
                        Integer.parseInt(audience.getText()),tempss,scores,league.getText(),weather1);
                if (Week.isWeekEnd(temp)) {
                    weekend.setSelected(true);
                } else if (Week.isWeekDay(temp)) {
                    weekday.setSelected(true);
                }
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        });

        clear.setOnAction((ActionEvent e)->{
            eventName.clear();
            eventDate.clear();
            wind.clear();
            place.clear();
            audience.clear();
            time.clear();
            score1.clear();
            score2.clear();
            team1.clear();
            team2.clear();
            league.clear();
            temperature.clear();
            humidity.clear();
            winner.clear();
            weekend.setSelected(false);
            weekday.setSelected(false);
            sunny.setSelected(false);
            notSunny.setSelected(false);
            goodWeather.setSelected(false);
            bad.setSelected(false);
        });

    }
    Pane getSoccerPane(){return SoccerPane;}

}
