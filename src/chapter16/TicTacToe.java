package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class TicTacToe extends Application {

    public static void main(String[] args) {Application.launch(args);}

    private char           whoseTurn = 'X';
    private final Cell[][] cell      = new Cell[3][3];
    private final Label    lblStatus = new Label("X's turn to play");

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) pane.add(cell[i][j] = new Cell(), j, i);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);

        Scene scene = new Scene(borderPane, 450, 170);
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.setTitle("TicTacToe");  // Set the stage title
        primaryStage.show();                 // Display the stage

    }  // start()

    public boolean isFull() {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) if (cell[i][j].getToken() == ' ') return false;
        return true;
    }  // isFull()

    public boolean isWon(char token) {

        for (int i = 0; i < 3; i++) if (cell[i][0].getToken() == token && cell[i][1].getToken() == token && cell[i][2].getToken() == token) {return true;}
        for (int j = 0; j < 3; j++) if (cell[0][j].getToken() == token && cell[1][j].getToken() == token && cell[2][j].getToken() == token) {return true;}

        if (cell[0][0].getToken() == token && cell[1][1].getToken() == token && cell[2][2].getToken() == token) {return true;}
        if (cell[0][2].getToken() == token && cell[1][1].getToken() == token && cell[2][0].getToken() == token) {return true;}

        return false;

    }  // isWon()

    public class Cell extends Pane {

        private char token;

        public Cell() {
            this.setToken(' ');
            super.setStyle("-fx-border-color: black");
            super.setPrefSize(2000, 2000);
            super.setOnMouseClicked(e -> handleMouseClick());
        }  // Cell()

        public final void setToken(char c) {

            this.token = c;

            if (this.getToken() == 'X') {

                Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);

                line1.endXProperty().bind(this.widthProperty ().subtract(10));
                line1.endYProperty().bind(this.heightProperty().subtract(10));

                Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);

                line2.startYProperty().bind(this.heightProperty().subtract(10));
                line2.endXProperty  ().bind(this.widthProperty ().subtract(10));

                this.getChildren().addAll(line1, line2);

            }  // if
            else if (this.getToken() == 'O') {

                Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 10, getHeight() / 2 - 10);
                ellipse.centerXProperty().bind(widthProperty ().divide(2));
                ellipse.centerYProperty().bind(heightProperty().divide(2));
                ellipse.radiusXProperty().bind(widthProperty ().divide(2).subtract(10));
                ellipse.radiusYProperty().bind(heightProperty().divide(2).subtract(10));
                ellipse.setStroke(Color.BLACK);
                ellipse.setFill  (Color.WHITE);

                super.getChildren().add(ellipse); // Add the ellipse to the pane

            }  // else if

        }  // setToken()

        public char getToken() {return this.token;}

        private void handleMouseClick() {

            if (this.getToken() == ' ' && whoseTurn != ' ') {

                this.setToken(whoseTurn);  // Set token in the cell

                if (isWon(whoseTurn)) {
                    lblStatus.setText(whoseTurn + " won! The game is over");
                    whoseTurn = ' '; // Game is over
                }  // if
                else if (isFull()) {
                    lblStatus.setText("Draw! The game is over");
                    whoseTurn = ' '; // Game is over
                }  // else if
                else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    lblStatus.setText(whoseTurn + "'s turn");
                }  // else

            }  // if

        }  // handleMouseClick()

    }  // class Cell

}  // class TicTacToe