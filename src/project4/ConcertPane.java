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
import project4.MusicEvent;
import javafx.event.ActionEvent;
import java.util.Date;
import java.text.ParseException;

public class ConcertPane extends Pane{

    ConcertPane() {}

    private TextField name = new TextField();
    private TextField date = new TextField();
    private TextField audience = new TextField();
    private TextField performers = new TextField();
    private TextField wind = new TextField();
    private Button clear = new Button("Clear");
    private TextField place = new TextField();
    private TextField time = new TextField();
    private TextField type = new TextField();
    private TextField temperature = new TextField();
    private TextField humidity = new TextField();
    private Button submit = new Button("Submit");

    private RadioButton weekend = new RadioButton("Yes");
    private RadioButton weekday = new RadioButton("No");
    private final ToggleGroup day = new ToggleGroup();
    private HBox dayPane = new HBox();

    private RadioButton sunny = new RadioButton("Yes");
    private RadioButton notSunny = new RadioButton("No");
    private final ToggleGroup sun = new ToggleGroup();
    private HBox sunPane = new HBox();

    private RadioButton good = new RadioButton("Yes");
    private RadioButton bad = new RadioButton("No");
    private final ToggleGroup weather = new ToggleGroup();
    private HBox weatherPane = new HBox();

    private Pane ConcertPane;
    private GridPane gridPane = new GridPane();

    {
        weekday.setToggleGroup(day);
        weekend.setToggleGroup(day);
        weekday.setDisable(true);
        weekend.setDisable(true);
        weekday.setOpacity(100);
        weekend.setOpacity(100);
        dayPane.getChildren().addAll(weekend,weekday);
        dayPane.setSpacing(25);

        sunny.setToggleGroup(sun);
        notSunny.setToggleGroup(sun);
        sunny.setDisable(false);
        notSunny.setDisable(false);
        sunny.setOpacity(100);
        notSunny.setOpacity(100);
        sunPane.getChildren().addAll(sunny,notSunny);
        sunPane.setSpacing(25);

        good.setToggleGroup(weather);
        bad.setToggleGroup(weather);
        good.setDisable(true);
        bad.setDisable(true);
        good.setOpacity(100);
        bad.setOpacity(100);
        weatherPane.getChildren().addAll(good,bad);
        weatherPane.setSpacing(25);

        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(name,1,0);
        gridPane.add(date,1,1);
        gridPane.add(audience,1,2);
        gridPane.add(performers,1,3);
        gridPane.add(sunPane,1,4);
        gridPane.add(wind,1,5);
        gridPane.add(clear,0,6);
        gridPane.add(dayPane,1,7);

        gridPane.add(place,3,0);
        gridPane.add(time,3,1);
        gridPane.add(type,3,2);
        gridPane.add(temperature,3,4);
        gridPane.add(humidity,3,5);
        gridPane.add(submit,2,6);
        gridPane.add(weatherPane,3,7);

        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(new Label("Date (mm/dd/yyyy):"), 0, 1);
        gridPane.add(new Label("Audience:"), 0, 2);
        gridPane.add(new Label("Performers:"),0,3);
        gridPane.add(new Label("Sunny:"),0,4);
        gridPane.add(new Label("Wind Speed:"),0,5);
        gridPane.add(new Label("Weekend:"),0,7);

        gridPane.add(new Label("Place:"), 2, 0);
        gridPane.add(new Label("Time (hh:mm)"), 2, 1);
        gridPane.add(new Label("Type:"),2,2);
        gridPane.add(new Label("Temperature:"),2,4);
        gridPane.add(new Label("Humidity:"),2,5);
        gridPane.add(new Label("Good Weather:"),2,7);

        name.setAlignment(Pos.BOTTOM_RIGHT);
        date.setAlignment(Pos.BOTTOM_RIGHT);
        audience.setAlignment(Pos.BOTTOM_RIGHT);
        performers.setAlignment(Pos.BOTTOM_RIGHT);
        wind.setAlignment(Pos.BOTTOM_RIGHT);
        place.setAlignment(Pos.BOTTOM_RIGHT);
        time.setAlignment(Pos.BOTTOM_RIGHT);
        type.setAlignment(Pos.BOTTOM_RIGHT);
        temperature.setAlignment(Pos.BOTTOM_RIGHT);
        humidity.setAlignment(Pos.BOTTOM_RIGHT);

        submit.setOnAction((ActionEvent e)->{
            try{
                Date temp = new Date(date.getText() + " " + time.getText());
                boolean weknd = Week.isWeekEnd(temp);
                String perform = performers.getText();
                String[] p = {perform};
                boolean sunny1 = false;
                if (sunny.hasProperties()){
                    sunny.setSelected(true);
                    sunny1 = true;
                }
                Double t = Double.parseDouble(temperature.getText());
                Double w = Double.parseDouble(wind.getText());
                Double h = Double.parseDouble(humidity.getText());
                Weather weather1 = new Weather(sunny1,t,w,h);
                if(t>=60 && t<=95 && w<=10 && h <=.80 && h>=.40){ good.setSelected(true);}
                else{bad.setSelected(true);}

                Concert concert = new Concert(name.getText(),place.getText(),temp,
                        Integer.parseInt(audience.getText()),p,type.getText(),weather1);

                if (Week.isWeekEnd(temp)) {
                    weekend.setSelected(true);
                } else if (Week.isWeekDay(temp)) {
                    weekday.setSelected(true);
                }
            }
            catch(java.text.ParseException e1){
                e1.printStackTrace();
            }
        });

        clear.setOnAction((ActionEvent e)->{
            name.clear();
            date.clear();
            audience.clear();
            performers.clear();
            sunny.setSelected(false);
            notSunny.setSelected(false);
            wind.clear();
            weekday.setSelected(false);
            weekend.setSelected(false);
            place.clear();
            time.clear();
            type.clear();
            temperature.clear();
            humidity.clear();
            good.setSelected(false);
            bad.setSelected(false);
        });

        ConcertPane = gridPane;
    }
        Pane getConcertPane () {
        return ConcertPane;
    }


}