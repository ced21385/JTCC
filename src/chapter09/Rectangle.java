package chapter09;

public class Rectangle {

    double width;
    double height;
    static int numberOfObjects;


    public Rectangle() {
       this.width = 1;
       this.height = 1;
       numberOfObjects = 0;
    }
    Rectangle(double recWidth, double recHeight){
        width = recWidth;
        height = recHeight;
    }
    double getArea(){
        System.out.println("Width: " + width + ": Height: " + height);
        numberOfObjects++;
        return width * height;

    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    }

