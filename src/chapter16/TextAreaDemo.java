package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import chapter16.DescriptionPane;

public class TextAreaDemo extends Application {

    public static void main(String[] args) {Application.launch(args);}

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitle("US");
        descriptionPane.setImageView(new ImageView("image/us.gif"));

        String description = "The US national flag ...";
        descriptionPane.setDescription(description);

        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.setTitle("TextAreaDemo");  // Set the stage title
        primaryStage.show();                    // Display the stage

    }  // start()

}  // class TextAreaDemo