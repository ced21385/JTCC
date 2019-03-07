package chapter15;

import java.lang.Math;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane {

    private int hour;
    private int minute;
    private int second;

    private double w = 250;
    private double h = 250;

    public ClockPane() {this.setCurrentTime();}  // no-arg constructor

    public ClockPane(int hour, int minute, int second) {
        this.setHour(hour); this.setMinute(minute); this.setSecond(second);
        this.paintClock();
    }  // ClockPane()

    public final void setHour(int hour) {this.hour = hour; this.paintClock();}
    public int        getHour()  {return this.hour;}

    public final void setMinute(int minute) {this.minute = minute; this.paintClock();}
    public int        getMinute()    {return this.minute;}

    public final void setSecond(int second) {this.second = second; this.paintClock();}
    public int        getSecond()    {return this.second;}

    public void   setW(double w) {this.w = w; this.paintClock();}
    public double getW()  {return this.w;}

    public void   setH(double h) {this.h = h; this.paintClock();}
    public double getH()  {return this.h;}

    public final void setCurrentTime() {

        Calendar calendar = new GregorianCalendar();

        this.setHour  (calendar.get(Calendar.HOUR_OF_DAY));
        this.setMinute(calendar.get(Calendar.MINUTE     ));
        this.setSecond(calendar.get(Calendar.SECOND     ));

        this.paintClock(); // Repaint the clock

    }  // setCurrentTime()

    private void paintClock() {

        double clockRadius = Math.min(this.getW(), this.getH()) * 0.8 * 0.5;
        double centerX = this.getW() / 2;
        double centerY = this.getH() / 2;

        Circle circle = new Circle(centerX, centerY, clockRadius);

        circle.setFill  (Color.WHITE);
        circle.setStroke(Color.BLACK);

        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5,  "9" );
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3" );
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3,  "6" );

        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(this.getSecond() * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(this.getSecond() * (2 * Math.PI / 60));

        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        double mLength = clockRadius * 0.65;
        double xMinute = centerX + mLength * Math.sin(this.getMinute() * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(this.getMinute() * (2 * Math.PI / 60));

        Line mLine = new Line(centerX, centerY, xMinute, minuteY);
        mLine.setStroke(Color.BLUE);

        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((this.getHour() % 12 + this.getMinute() / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((this.getHour() % 12 + this.getMinute() / 60.0) * (2 * Math.PI / 12));

        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);

    }  // paintClock()

}  // class ClockPane