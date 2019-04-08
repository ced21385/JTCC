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

public class OrchestraPane extends Pane{

    OrchestraPane(){}

        private TextField name = new TextField();
        private TextField date = new TextField();
        private TextField audience = new TextField();
        private RadioButton attire = new RadioButton("Yes");
        private RadioButton noAttire = new RadioButton("No");
        private Button clear = new Button("Clear");
        private TextField place = new TextField();
        private TextField time = new TextField();
        private TextField performers = new TextField();
        private Button submit = new Button("Submit");

        private RadioButton weekend = new RadioButton("Yes");
        private RadioButton weekday = new RadioButton("No");
        private final ToggleGroup radioGroup = new ToggleGroup();

        private final ToggleGroup radioGroup2 = new ToggleGroup();
        private HBox radioGroup2Pane = new HBox();

        private Pane OrchestraPane;
        private GridPane gridPane = new GridPane();
        private HBox radioGroupPane = new HBox();

    {

        weekend.setToggleGroup(radioGroup);
        weekday.setToggleGroup(radioGroup);
        weekend.setDisable(true);
        weekday.setDisable(true);
        weekend.setOpacity(100);
        weekday.setOpacity(100);

        attire.setToggleGroup(radioGroup2);
        noAttire.setToggleGroup(radioGroup2);
        attire.setDisable(false);
        noAttire.setDisable(false);
        attire.setOpacity(100);
        noAttire.setOpacity(100);

        radioGroupPane.getChildren().addAll(weekend,weekday);
        radioGroupPane.setSpacing(25);
        radioGroup2Pane.getChildren().addAll(attire,noAttire);
        radioGroup2Pane.setSpacing(25);

        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(name,1,0);
        gridPane.add(date,1,1);
        gridPane.add(audience,1,2);
        gridPane.add(radioGroup2Pane,1,3);
        gridPane.add(clear,0,4);
        gridPane.add(radioGroupPane,1,5);

        gridPane.add(place,3,0);
        gridPane.add(time,3,1);
        gridPane.add(performers,3,2);
        gridPane.add(submit,2,4);

        gridPane.add(new Label("Name:"),0,0);
        gridPane.add(new Label("Date (mm/dd/yyyy):"),0,1);
        gridPane.add(new Label("Audience:"),0,2);
        gridPane.add(new Label("Casual Attire:"),0,3);
        gridPane.add(new Label("Weekend:"),0,5);

        gridPane.add(new Label("Place:"),2,0);
        gridPane.add(new Label("Time (hh:mm)"),2,1);
        gridPane.add(new Label("Performers:"),2,2);

        name.setAlignment(Pos.BOTTOM_RIGHT);
        date.setAlignment(Pos.BOTTOM_RIGHT);
        audience.setAlignment(Pos.BOTTOM_RIGHT);
        place.setAlignment(Pos.BOTTOM_RIGHT);
        time.setAlignment(Pos.BOTTOM_RIGHT);
        performers.setAlignment(Pos.BOTTOM_RIGHT);

        OrchestraPane = gridPane;

//        submit.setOnAction((ActionEvent e)-> {
//            try {
//                Date temp = new Date(date.getText() + " " + time.getText());
//                boolean weknd = Week.isWeekEnd(temp);
//
//                MusicEvent orchestra = new MusicEvent(name.getText(), place.getText(), temp,
//                        performers.getText(),Integer.parseInt(audience.getText()));
//                if (Week.isWeekEnd(temp)) {
//                    weekend.setSelected(true);
//                } else if (Week.isWeekDay(temp)) {
//                    weekday.setSelected(true);
//                }
//            } catch (ParseException e1) {
//                e1.printStackTrace();
//            }
//        });
        clear.setOnAction((ActionEvent e)->{
            name.clear();
            date.clear();
            audience.clear();
            performers.clear();
            attire.setSelected(false);
            noAttire.setSelected(false);
            place.clear();
            time.clear();
        });
    }

    Pane getOrchestraPane(){return OrchestraPane;}
}
