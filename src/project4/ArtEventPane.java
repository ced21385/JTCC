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
import project4.ArtEvent;
import javafx.event.ActionEvent;
import java.util.Date;

import java.text.ParseException;

public class ArtEventPane {

    ArtEventPane() {}

    private TextField eventName = new TextField();
    private TextField place = new TextField();
    private TextField date = new TextField();
    private TextField time = new TextField();
    private TextField audience = new TextField();
    private TextField type = new TextField();

    private Button clear = new Button("Clear");
    private Button submit = new Button("Submit");
    private RadioButton weekend = new RadioButton("Yes");
    private RadioButton weekday = new RadioButton("No");
    private final ToggleGroup radioGroup = new ToggleGroup();

    private Pane ArtPane;
    private GridPane gridPane = new GridPane();
    private HBox radioGroupPane = new HBox();
    {
        weekend.setToggleGroup(radioGroup);
        weekday.setToggleGroup(radioGroup);
        weekend.setDisable(true);
        weekday.setDisable(true);
        weekend.setOpacity(100);
        weekday.setOpacity(100);
        radioGroupPane.getChildren().addAll(weekend,weekday);
        radioGroupPane.setSpacing(25);

        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(eventName, 1,0);
        gridPane.add(date,1,1);
        gridPane.add(audience,1,2);
        gridPane.add(clear,0,3);
        gridPane.add(radioGroupPane,1,4);

        gridPane.add(place,3,0);
        gridPane.add(time,3,1);
        gridPane.add(type, 3,2);
        gridPane.add(submit,2,3);

        gridPane.add(new Label("Name:"), 0,0);
        gridPane.add(new Label( "Date (mm/dd/yyyy):"),0,1);
        gridPane.add(new Label("Audience: "),0,2);
        gridPane.add(new Label("Weekend:"),0,4);

        gridPane.add(new Label("Place:"),2,0);
        gridPane.add(new Label("Time (hh:mm)"),2,1);
        gridPane.add(new Label("Type:"),2,2);

        ArtPane = gridPane;

       submit.setOnAction((ActionEvent e)-> {
                   try {
                       Date temp = new Date(date.getText() + " " + time.getText());
                       boolean weknd = Week.isWeekEnd(temp);

                       ArtEvent artEvent = new ArtEvent(eventName.getText(), place.getText(), temp,
                               Integer.parseInt(audience.getText()), type.getText());
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
            date.clear();
            place.clear();
            audience.clear();
            time.clear();
            type.clear();
            weekend.setSelected(false);
            weekday.setSelected(false);
       });
    }

    Pane getArtPane(){return ArtPane; }
}
