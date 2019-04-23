package profAnswers202;
//chapter14
import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplayFourFlags extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ImageView imageView1 = new ImageView("image/us.gif");
        ImageView imageView2 = new ImageView("image/ca.gif");
        ImageView imageView3 = new ImageView("image/fr.gif");
        ImageView imageView4 = new ImageView("image/uk.gif");

        GridPane pane = new GridPane();

        pane.add(imageView1, 0, 0); pane.add(imageView2, 1, 0);
        pane.add(imageView3, 0, 1); pane.add(imageView4, 1, 1);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Four Flags");
        primaryStage.show();

    }  // start()

}  // class DisplayFourFlags