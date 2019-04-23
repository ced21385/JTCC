package profAnswers202;
//chapter15
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PickFourCards extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {list.add(i);}

        Collections.shuffle(list);

        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);

        hBox.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
        hBox.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
        hBox.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
        hBox.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));

        Button btRefresh = new Button("Refresh");

        btRefresh.setOnAction(e -> {
            Collections.shuffle(list);
            hBox.getChildren().clear();
            hBox.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
            hBox.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
            hBox.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
            hBox.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(hBox);
        pane.setBottom(btRefresh);

        BorderPane.setAlignment(btRefresh, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setScene(scene);            // Place the scene in the stage
        primaryStage.setTitle("PickFourCards");  // Set the stage title
        primaryStage.show();                     // Display the stage

    }  // start()

}  // class PickFourCards
