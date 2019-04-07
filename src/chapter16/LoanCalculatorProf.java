package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import chapter16.LoanCalculatorPane;

public class LoanCalculatorProf extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        LoanCalculatorPaneProf loanCalculatorPaneProf = new LoanCalculatorPaneProf();

        Scene scene = new Scene(loanCalculatorPaneProf, 400, 200);
        primaryStage.setScene(scene);             // Place the scene in the stage
        primaryStage.setTitle("LoanCalculator");  // Set title
        primaryStage.show();                      // Display the stage

    }  // start()

}  // class LoanCalculator