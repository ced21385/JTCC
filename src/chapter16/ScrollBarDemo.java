package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ScrollBarDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}


    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        Text text = new Text(20, 20, "JavaFX Programming");

        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical   = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText );
        pane.setBottom(sbHorizontal);
        pane.setRight (sbVertical  );

        sbHorizontal.valueProperty().addListener(ov -> text.setX(sbHorizontal.getValue() * paneForText.getWidth () / sbHorizontal.getMax()));
        sbVertical.  valueProperty().addListener(ov -> text.setY(sbVertical  .getValue() * paneForText.getHeight() / sbVertical  .getMax()));

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setScene(scene);            // Place the scene in the stage
        primaryStage.setTitle("ScrollBarDemo");  // Set the stage title
        primaryStage.show();                     // Display the stage

    }  // start()

}  // class ScrollBarDemo