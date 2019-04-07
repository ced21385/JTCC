package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import chapter16.InvestmentValueCalculatorPane;

public class InvestmentValueCalculatorProf extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        InvestmentValueCalculatorPaneProf investmentValueCalculatorPaneProf = new InvestmentValueCalculatorPaneProf();

        Scene scene = new Scene(investmentValueCalculatorPaneProf, 400, 250);
        primaryStage.setScene(scene);                        // place the scene in the stage
        primaryStage.setTitle("InvestmentValueCalculator");  // set title
        primaryStage.show();                                 // display the stage

    }  // start()

    public static void main(String[] args) {Application.launch(args);}

}  // class InvestmentValueCalculator