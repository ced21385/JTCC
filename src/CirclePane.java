package chapter15;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {

    private Circle circle;  // instance variable

    public CirclePane() {
        super();  // constructor chaining
        this.setCircle(new Circle(50));
        super.getChildren().add(this.getCircle());
    }  // CirclePane()

    public final void   setCircle(Circle circle) {this.circle = circle;}
    public final Circle getCircle()       {return this.circle;}

    public void enlargeCircle() {this.getCircle().setRadius(this.getCircle().getRadius() + 2);}
    public void shrinkCircle () {this.getCircle().setRadius(this.getCircle().getRadius() > 2 ? this.getCircle().getRadius() - 2 : this.getCircle().getRadius());}

}  // class CirclePane
