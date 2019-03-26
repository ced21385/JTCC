package chapter16;

import java.lang.String;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane {

    private Label    lblImageTitle;
    private TextArea taDescription;

    public DescriptionPane() {  // no-arg constructor

        this.setLblImageTitle(new Label());
        this.setTaDescription(new TextArea());

        this.getLblImageTitle().setContentDisplay(ContentDisplay.TOP);
        this.getLblImageTitle().setPrefSize(200, 100);
        this.getLblImageTitle().setFont(new Font("SansSerif", 16));

        this.getTaDescription().setFont(new Font("Serif", 14));
        this.getTaDescription().setWrapText(true);
        this.getTaDescription().setEditable(false);

        ScrollPane scrollPane = new ScrollPane(this.getTaDescription());

        super.setLeft   (this.getLblImageTitle());
        super.setCenter (scrollPane);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  // DescirptionPane()

    public final void  setLblImageTitle(Label lblImageTitle) {this.lblImageTitle = lblImageTitle;}
    public final Label getLblImageTitle() {return this.lblImageTitle;}

    public final void     setTaDescription(TextArea taDescription) {this.taDescription = taDescription;}
    public final TextArea getTaDescription() {return this.taDescription;}

    public void setTitle(String title) {this.getLblImageTitle().setText(title);}

    public void setImageView(ImageView icon) {this.getLblImageTitle().setGraphic(icon);}

    public void setDescription(String text) {this.getTaDescription().setText(text);}

}  // class DescriptionPane