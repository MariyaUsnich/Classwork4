package firstpackage;

public class Circle implements Shape {

    Circle() {
        radius = 0;
    }
 public Circle(double _radius) {
        radius = _radius;
 }
    @Override
    public double getArea() {
        return Pi * (Math.pow(radius, 2));
    }

    private final double Pi = 3.14;
    private double radius;
}
