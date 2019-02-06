package chapter09;

public class Square {

    double side;
    static int numberOfObjects;




    public Square() {
        side = 1;
        numberOfObjects = 0;
    }


    Square(double square) {
        this.side = square;

    }


        double getArea () {
            System.out.println("Side: "+ side);
            numberOfObjects++;
            return Math.pow(side, 2);

        }

        static int getNumberOfObjects () {
            return numberOfObjects;
        }



}
