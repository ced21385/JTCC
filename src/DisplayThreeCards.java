package chapter14;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplayThreeCards extends Application {

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 52; i++) {

            list.add(Integer.valueOf(i + 1));
        }

            java.util.Collections.shuffle(list);
        HBox hbox = new HBox();

        for(int i= 0; i < 3; i++) {

            hbox.getChildren().add(new ImageView(new Image("image/card/" +
                    list.get(i) + ".png")));
        }

            Scene scene = new Scene(hbox,250,100);
            primaryStage.setTitle("Three Cards");
            primaryStage.setScene(scene);
            primaryStage.show();

    }

}
