package Sprint_4.Day0;

abstract class Shape{
        abstract int rectangleArea(int length, int breadth);
        abstract int squareArea(int side);
        abstract double circleArea(int radius);
}

class Area extends Shape{

    @Override
    int rectangleArea(int length, int breadth) {
        return length*breadth;
    }

    @Override
    int squareArea(int side) {
        return side*side;
    }

    @Override
    double circleArea(int radius) {
        return 3.14*radius*radius;
    }
}


public class Q2 {
    public static void main(String[] args) {
        Area area = new Area();
        int areaOfRect = area.rectangleArea(2,3);
        System.out.println(areaOfRect);

        int areaOfSqu = area.squareArea(4);
        System.out.println(areaOfSqu);

        double areaOfCir = area.circleArea(5);
        System.out.println(areaOfCir);
    }
}
