package chapter16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {

    private final double radius = 20;
    private double x = getRadius();
    private double y = getRadius();
    private double dx = 1;
    private double dy = 1;
    private final Circle circle = new Circle(this.getX(), this.getY(), this.getRadius(), Color.GREEN);
    private final Timeline animation;

    public BallPane() {

        super.getChildren().add(this.getCircle());  // Place a ball into this pane

        // Create an animation for moving the ball
        this.animation = new Timeline
                (
                        new KeyFrame(Duration.millis(50), e -> this.moveBall())
                );

        this.getAnimation().setCycleCount(Timeline.INDEFINITE);
        this.getAnimation().play();  // Start animation

    }  // BallPane()

    public final double getRadius() {return this.radius;}

    public final void   setX(double x) {this.x = x;}
    public final double getX()  {return this.x;}

    public final void   setY(double y) {this.y = y;}
    public final double getY()  {return this.y;}

    public final void setDX(double dx) {this.dx = dx;}
    public double     getDX()   {return this.dx;}

    public final void setDY(double dy) {this.dy = dy;}
    public double     getDY()   {return this.dy;}

    public final Circle getCircle() {return this.circle;}

    public final Timeline getAnimation() {return this.animation;}

    public void play () {this.getAnimation().play ();}
    public void pause() {this.getAnimation().pause();}

    public void increaseSpeed() {this.getAnimation().setRate(this.getAnimation().getRate() + 0.1);}
    public void decreaseSpeed() {this.getAnimation().setRate(this.getAnimation().getRate() > 0 ? this.getAnimation().getRate() - 0.1 : 0);}

    public DoubleProperty rateProperty() {return this.getAnimation().rateProperty();}

    protected void moveBall() {

        // Check boundaries
        if (this.getX() < this.getRadius() || this.getX() > this.getWidth () - this.getRadius()) {this.setDX(this.getDX() * -1);}
        if (this.getY() < this.getRadius() || this.getY() > this.getHeight() - this.getRadius()) {this.setDY(this.getDY() * -1);}  // Change ball move direction

        // Adjust ball position
        this.setX(this.getX() + this.getDX());
        this.setY(this.getY() + this.getDY());
        this.getCircle().setCenterX(this.getX());
        this.getCircle().setCenterY(this.getY());

    } // moveBall()

}  // class BallPane
