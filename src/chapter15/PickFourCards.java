package chapter15;

import java.lang.String;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class PickFourCards extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        setRandomCards(hBox);

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        buttons.setSpacing(10);
        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction(e -> setRandomCards(hBox));
        buttons.getChildren().add(btRefresh);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(hBox);
        borderPane.setBottom(buttons);
        BorderPane.setMargin(buttons, new Insets(10, 10, 10, 10));
        borderPane.setPadding(new Insets(10, 10, 0, 10));
        borderPane.autosize();

        Scene scene = new Scene(borderPane, borderPane.getPrefWidth(), borderPane.getPrefHeight());
        primaryStage.setTitle("Four Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setRandomCards(HBox pane){

        pane.getChildren().clear();

        ArrayList<Integer> List = new ArrayList<>();

        for(int i = 0; i < 52; i++) {
            List.add(Integer.valueOf(i + 1));
        }
        java.util.Collections.shuffle(List);

        for(int i = 0; i < 4; i++){
                pane.getChildren().add(new ImageView(new Image("image/card/" + List.get(i) + ".png")));
            }
        }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
