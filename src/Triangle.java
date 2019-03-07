package chapter13;

public class Triangle extends GeometricObject {

    private double[] sides = new double[3];

    public Triangle(double side1, double side2, double side3){
        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;

 }
    public Triangle(){
        this.sides[0] = 1;
        this.sides[1] = 1;
        this.sides[2] = 1;
    }

    @Override
    public double getArea() {
        double semiP = ((sides[0] + sides[1] + sides[2])/2);
        double area = Math.sqrt(semiP * (semiP - sides[0]) * (semiP - sides[1]) * (semiP - sides[2]));
        return area;
    }

    @Override
    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    @Override
    public String toString() {
        return ("Triangle: " + "side1 = " + sides[0] + ", side2 = " + sides[1]
         + ", side3 = " + sides[2]);
    }





}

