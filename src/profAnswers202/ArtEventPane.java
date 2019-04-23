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
import profAnswers202.Event04;
import profAnswers202.ArtEvent04;

public class ArtEventPane extends GridPane {

    private final TextField tfName     = new TextField();
    private final TextField tfPlace    = new TextField();
    private final TextField tfDate     = new TextField();
    private final TextField tfTime     = new TextField();
    private final TextField tfAudience = new TextField();
    private final TextField tfType     = new TextField();

    private final Label       lblWeekEnd   = new Label      ("Weekend:");
    private final RadioButton rbWeekEndYes = new RadioButton("Yes"     );
    private final RadioButton rbWeekEndNo  = new RadioButton("No"      );
    private final HBox        hBoxWeekEnd  = new HBox       (10, this.getRbWeekEndYes(), this.getRbWeekEndNo());

    protected ArtEventPane() {

        this.getTfName    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPlace   ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfDate    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTime    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfAudience().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfType    ().setAlignment(Pos.BOTTOM_RIGHT);

        Button btSubmit = new Button("Submit");
        Button btClear  = new Button("Clear" );

        btSubmit.setOnAction(e -> this.submit());
        btClear .setOnAction(e -> this.clear ());

        GridPane.setHalignment(btClear , HPos.LEFT);
        GridPane.setHalignment(btSubmit, HPos.LEFT);

        super.add(new Label("Name:"             ), 0, 0); super.add(this.getTfName    (), 1, 0); super.add(new Label("Place:"       ), 2, 0); super.add(this.getTfPlace(), 3, 0);
        super.add(new Label("Date (mm/dd/yyyy):"), 0, 1); super.add(this.getTfDate    (), 1, 1); super.add(new Label("Time (hh:mm):"), 2, 1); super.add(this.getTfTime (), 3, 1);
        super.add(new Label("Audience:"         ), 0, 2); super.add(this.getTfAudience(), 1, 2); super.add(new Label("Type:"        ), 2, 2); super.add(this.getTfType (), 3, 2);
        super.add(btClear                        , 0, 3);                                        super.add(btSubmit                  , 2, 3);

        super.setHgap(5);
        super.setVgap(5);
        super.setAlignment(Pos.CENTER);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  // ArtEventPane()

    public final TextField getTfName    () {return this.tfName    ;}
    public final TextField getTfPlace   () {return this.tfPlace   ;}
    public final TextField getTfDate    () {return this.tfDate    ;}
    public final TextField getTfTime    () {return this.tfTime    ;}
    public final TextField getTfAudience() {return this.tfAudience;}
    public final TextField getTfType    () {return this.tfType    ;}

    public RadioButton getRbWeekEndYes() {return this.rbWeekEndYes;}
    public RadioButton getRbWeekEndNo () {return this.rbWeekEndNo ;}

    public Label getLblWeekEnd () {return this.lblWeekEnd ;}
    public HBox  getHBoxWeekEnd() {return this.hBoxWeekEnd;}

    public void submit() {

        String name  = this.getTfName ().getText().trim();
        String place = this.getTfPlace().getText().trim();
        String type  = this.getTfType ().getText().trim();

        int audience = Integer.parseInt(this.getTfAudience().getText().trim());

        Date dateTime = new Date();  // initial value: now
        try {dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + (this.getTfTime().getText().trim().isEmpty()? "00:00" : this.getTfTime().getText().trim()));} catch (ParseException ex) {}

        Event04 event = new Event04();
        try  {event = new ArtEvent04(name, place, dateTime, audience, type);} catch (ParseException ex) {}

        this.getRbWeekEndYes().setSelected( event.isWeekEnd());
        this.getRbWeekEndNo ().setSelected(!event.isWeekEnd());

        super.getChildren().remove(this.getLblWeekEnd ());
        super.getChildren().remove(this.getHBoxWeekEnd());

        super.add(this.getLblWeekEnd (), 0, 4);
        super.add(this.getHBoxWeekEnd(), 1, 4);

    }  // submit()

    public void clear() {

        this.getTfName    ().clear();
        this.getTfPlace   ().clear();
        this.getTfDate    ().clear();
        this.getTfTime    ().clear();
        this.getTfAudience().clear();
        this.getTfType    ().clear();

        super.getChildren().remove(this.getLblWeekEnd ());
        super.getChildren().remove(this.getHBoxWeekEnd());

    }  // clear()

}  // class ArtEventPane
