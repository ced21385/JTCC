package profAnswers202;
//project04
import java.lang.Integer;
import java.util.Iterator;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import project4.Event;
import project4.SportEvent;
import project4.MusicEvent;
import project4.ArtEvent;
import project4.SoccerGame;
import project4.BasketBallGame;
import project4.Concert;
import project4.Orchestra;

public final class StatisticsPane extends BorderPane{

    private final TextField tfEvents          = new TextField();
    private final TextField tfSportEvents     = new TextField();
    private final TextField tfMusicEvents     = new TextField();
    private final TextField tfArtEvents       = new TextField();
    private final TextField tfSoccerGames     = new TextField();
    private final TextField tfBasketBallGames = new TextField();
    private final TextField tfConcerts        = new TextField();
    private final TextField tfOrchestras      = new TextField();
    private final TextArea  taDisplayEvents   = new TextArea ();

    protected StatisticsPane() {

        this.getTfEvents         ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfSportEvents    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfMusicEvents    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfArtEvents      ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfSoccerGames    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfBasketBallGames().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfConcerts       ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfOrchestras     ().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfEvents         ().setEditable(false);
        this.getTfSportEvents    ().setEditable(false);
        this.getTfMusicEvents    ().setEditable(false);
        this.getTfArtEvents      ().setEditable(false);
        this.getTfSoccerGames    ().setEditable(false);
        this.getTfBasketBallGames().setEditable(false);
        this.getTfConcerts       ().setEditable(false);
        this.getTfOrchestras     ().setEditable(false);

        this.getTaDisplayEvents().setPrefColumnCount(60);
        this.getTaDisplayEvents().setPrefRowCount   (30);
        this.getTaDisplayEvents().setWrapText     (true);
        this.getTaDisplayEvents().setEditable    (false);

        Button btCount = new Button("Count");
        Button btClear = new Button("Clear");

        btCount.setOnAction(e -> this.count());
        btClear.setOnAction(e -> this.clear());

        GridPane.setHalignment(btClear, HPos.LEFT);
        GridPane.setHalignment(btCount, HPos.LEFT);

        GridPane gridPane = new GridPane();

        gridPane.add(new Label("Events:"      ), 0, 0); gridPane.add(this.getTfEvents     (), 1, 0);
        gridPane.add(new Label("Sport Events:"), 0, 1); gridPane.add(this.getTfSportEvents(), 1, 1); gridPane.add(new Label("Music Events:"    ), 2, 1); gridPane.add(this.getTfMusicEvents    (), 3, 1); gridPane.add(new Label("Art Events:"), 4, 1); gridPane.add(this.getTfArtEvents(), 5, 1);
        gridPane.add(new Label("Soccer Games:"), 0, 2); gridPane.add(this.getTfSoccerGames(), 1, 2); gridPane.add(new Label("Basketball Games:"), 2, 2); gridPane.add(this.getTfBasketBallGames(), 3, 2);
        gridPane.add(new Label("Concerts:"    ), 0, 3); gridPane.add(this.getTfConcerts   (), 1, 3); gridPane.add(new Label("Orchestras:"      ), 2, 3); gridPane.add(this.getTfOrchestras     (), 3, 3);
        gridPane.add(btClear                   , 0, 4);                                              gridPane.add(btCount                       , 2, 4);

        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding  (new Insets(5, 5, 5, 5));

        ScrollPane scrollPane = new ScrollPane(this.getTaDisplayEvents());
        scrollPane.setPadding(new Insets(5, 5, 5, 5));

        super.setCenter (gridPane  );
        super.setBottom (scrollPane);
        super.setPadding(new Insets(5, 5, 5, 5));

        BorderPane.setAlignment(gridPane,   Pos.CENTER);
        BorderPane.setAlignment(scrollPane, Pos.BOTTOM_CENTER);

    }  // StatisticsPane()

    public TextField getTfEvents         () {return this.tfEvents         ;}
    public TextField getTfSportEvents    () {return this.tfSportEvents    ;}
    public TextField getTfMusicEvents    () {return this.tfMusicEvents    ;}
    public TextField getTfArtEvents      () {return this.tfArtEvents      ;}
    public TextField getTfSoccerGames    () {return this.tfSoccerGames    ;}
    public TextField getTfBasketBallGames() {return this.tfBasketBallGames;}
    public TextField getTfConcerts       () {return this.tfConcerts       ;}
    public TextField getTfOrchestras     () {return this.tfOrchestras     ;}
    public TextArea  getTaDisplayEvents  () {return this.taDisplayEvents  ;}

    public void count() {

        this.getTfEvents         ().setText(Integer.toString(Event         .getNumberOfObjects()));
        this.getTfSportEvents    ().setText(Integer.toString(SportEvent    .getNumberOfObjects()));
        this.getTfMusicEvents    ().setText(Integer.toString(MusicEvent    .getNumberOfObjects()));
        this.getTfArtEvents      ().setText(Integer.toString(ArtEvent      .getNumberOfObjects()));
        this.getTfSoccerGames    ().setText(Integer.toString(SoccerGame    .getNumberOfObjects()));
        this.getTfBasketBallGames().setText(Integer.toString(BasketBallGame.getNumberOfObjects()));
        this.getTfConcerts       ().setText(Integer.toString(Concert       .getNumberOfObjects()));
        this.getTfOrchestras     ().setText(Integer.toString(Orchestra     .getNumberOfObjects()));

        String events = (Event04.getEventList().isEmpty()) ? "" : "Events:\n" + Event04.getEventList().toString() + "\n\n";

        Iterator<Event04> eventListIterator = Event04.getEventList().iterator();
        Event04 event;
        int   eventNumber;
        while (eventListIterator.hasNext()) {
            event       = eventListIterator.next();
            eventNumber = Event04.getEventList().indexOf(event) + 1;
            events = events + "Event " + String.valueOf(eventNumber) + ": Class: " + event.getClass().getSimpleName() + ",\tEvent Name: " + event.getName() + "\n";
        }  // while

        this.getTaDisplayEvents().setText(events);

    }  // count()

    public void clear() {
        this.getTfEvents         ().clear();
        this.getTfSportEvents    ().clear();
        this.getTfMusicEvents    ().clear();
        this.getTfArtEvents      ().clear();
        this.getTfSoccerGames    ().clear();
        this.getTfBasketBallGames().clear();
        this.getTfConcerts       ().clear();
        this.getTfOrchestras     ().clear();
        this.getTaDisplayEvents  ().clear();
    }  // clear()

}  // class StatisticsPane
