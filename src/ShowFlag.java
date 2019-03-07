package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ShowFlag extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override
    public void start(Stage primaryStage) {

        Image image = new Image("image/us.gif");  // C:\michael\demo\build\classes\image\\us.gif

        ImageView imageView1 = new ImageView(image);

        ImageView imageView2 = new ImageView(image);
        imageView2.setRotate(90.0);

        Pane pane = new HBox();

        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("ShowFlag");
        primaryStage.show();

    }  // start()

}  // class ShowCircle