package profAnswers202;
//chapter14
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplayThreeCards extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {list.add(i);}
        Collections.shuffle(list);

        // HBox pane = new HBox(10);
        HBox pane = new HBox();
        // pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
        pane.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
        pane.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);         // Place the scene in the stage
        primaryStage.setTitle("Three Cards"); // Set the stage title
        primaryStage.show();                  // Display the stage

    }  // start()

}  // class DisplayThreeCards
