package profAnswers202;
//project04
import java.lang.String;
import java.lang.Integer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class BasketBallGamePane extends GridPane {

    private final TextField tfName     = new TextField();
    private final TextField tfPlace    = new TextField();
    private final TextField tfDate     = new TextField();
    private final TextField tfTime     = new TextField();
    private final TextField tfAudience = new TextField();
    private final TextField tfLeague   = new TextField();
    private final TextField tfTeam1    = new TextField();
    private final TextField tfScore1   = new TextField();
    private final TextField tfTeam2    = new TextField();
    private final TextField tfScore2   = new TextField();

    private final Label     lblWinnerName = new Label ("Winner:");
    private final TextField tfWinnerName  = new TextField();

    private final Label       lblWeekEnd   = new Label      ("Weekend:");
    private final RadioButton rbWeekEndYes = new RadioButton("Yes"     );
    private final RadioButton rbWeekEndNo  = new RadioButton("No"      );
    private final HBox        hBoxWeekEnd  = new HBox       (10, this.getRbWeekEndYes(), this.getRbWeekEndNo());

    protected BasketBallGamePane() {

        this.getTfName    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPlace   ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfDate    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTime    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfAudience().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTeam1   ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTeam2   ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfScore1  ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfScore2  ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfLeague  ().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfWinnerName().setEditable(false);

        Button btSubmit = new Button("Submit");
        Button btClear  = new Button("Clear" );

        btSubmit.setOnAction(e -> this.submit());
        btClear .setOnAction(e -> this.clear ());

        GridPane.setHalignment(btClear , HPos.LEFT);
        GridPane.setHalignment(btSubmit, HPos.LEFT);

        super.add(new Label("Name:"             ), 0, 0); super.add(this.getTfName    (), 1, 0); super.add(new Label("Place:"       ), 2, 0); super.add(this.getTfPlace (), 3, 0);
        super.add(new Label("Date (mm/dd/yyyy):"), 0, 1); super.add(this.getTfDate    (), 1, 1); super.add(new Label("Time (hh:mm):"), 2, 1); super.add(this.getTfTime  (), 3, 1);
        super.add(new Label("Audience:"         ), 0, 2); super.add(this.getTfAudience(), 1, 2); super.add(new Label("League:"      ), 2, 2); super.add(this.getTfLeague(), 3, 2);
        super.add(new Label("Team 1:"           ), 0, 3); super.add(this.getTfTeam1   (), 1, 3); super.add(new Label("Score 1:"     ), 2, 3); super.add(this.getTfScore1(), 3, 3);
        super.add(new Label("Team 2:"           ), 0, 4); super.add(this.getTfTeam2   (), 1, 4); super.add(new Label("Score 2:"     ), 2, 4); super.add(this.getTfScore2(), 3, 4);
        super.add(btClear                        , 0, 5);                                        super.add(btSubmit                  , 2, 5);

        super.setHgap(5);
        super.setVgap(5);
        super.setAlignment(Pos.CENTER);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  // BasketBallGamePane()

    public final TextField getTfName    () {return this.tfName    ;}
    public final TextField getTfPlace   () {return this.tfPlace   ;}
    public final TextField getTfDate    () {return this.tfDate    ;}
    public final TextField getTfTime    () {return this.tfTime    ;}
    public final TextField getTfAudience() {return this.tfAudience;}
    public final TextField getTfLeague  () {return this.tfLeague  ;}
    public final TextField getTfTeam1   () {return this.tfTeam1   ;}
    public final TextField getTfScore1  () {return this.tfScore1  ;}
    public final TextField getTfTeam2   () {return this.tfTeam2   ;}
    public final TextField getTfScore2  () {return this.tfScore2  ;}

    public       Label     getLblWinnerName() {return this.lblWinnerName;}
    public final TextField getTfWinnerName () {return this.tfWinnerName ;}

    public RadioButton getRbWeekEndYes() {return this.rbWeekEndYes;}
    public RadioButton getRbWeekEndNo () {return this.rbWeekEndNo ;}

    public Label getLblWeekEnd () {return this.lblWeekEnd ;}
    public HBox  getHBoxWeekEnd() {return this.hBoxWeekEnd;}

    public void submit() {

        String name   = this.getTfName  ().getText().trim();
        String place  = this.getTfPlace ().getText().trim();
        String league = this.getTfLeague().getText().trim();

        String[] teams  = {this.getTfTeam1().getText().trim(), this.getTfTeam2().getText().trim()};
        int   [] scores = {Integer.parseInt(this.getTfScore1().getText().trim()), Integer.parseInt(this.getTfScore2().getText().trim())};

        int audience = Integer.parseInt(this.getTfAudience().getText().trim());

        Date dateTime = new Date();  // initial value
        try {dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + (this.getTfTime().getText().trim().isEmpty()? "00:00" : this.getTfTime().getText().trim()));} catch (ParseException ex) {}

        Event04 event = new Event04();
        try {event = new BasketBallGame04(name, place, dateTime, audience, teams, scores, league);} catch (ParseException ex) {}

        this.getTfWinnerName().setText(((SportEvent04)event).getWinnerName());

        this.getRbWeekEndYes().setSelected( event.isWeekEnd());
        this.getRbWeekEndNo ().setSelected(!event.isWeekEnd());

        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName ());
        super.getChildren().remove(this.getLblWeekEnd   ());
        super.getChildren().remove(this.getHBoxWeekEnd  ());

        super.add(this.getLblWinnerName(), 0, 6);
        super.add(this.getTfWinnerName (), 1, 6);
        super.add(this.getLblWeekEnd   (), 0, 7);
        super.add(this.getHBoxWeekEnd  (), 1, 7);

    }  // submit()

    public void clear() {

        this.getTfName    ().clear();
        this.getTfPlace   ().clear();
        this.getTfDate    ().clear();
        this.getTfTime    ().clear();
        this.getTfAudience().clear();
        this.getTfLeague  ().clear();
        this.getTfTeam1   ().clear();
        this.getTfScore1  ().clear();
        this.getTfTeam2   ().clear();
        this.getTfScore2  ().clear();

        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName ());
        super.getChildren().remove(this.getLblWeekEnd   ());
        super.getChildren().remove(this.getHBoxWeekEnd  ());

    }  // clear()

}  // class BasketBallGamePane
