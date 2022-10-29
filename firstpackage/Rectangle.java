package firstpackage;

public class Rectangle implements Shape {
    private double length;
    private double height;

    public Rectangle(){
        length = 0;
        height = 0;
    }

    public  Rectangle(double _length, double _height){
        length = _length;
        height = _height;
    }

    public void setLength(double _length){
        length = _length;
    }

    public void setHigh(double _height){
        height = _height;
    }

    @Override
    public double getArea() {
        return length * height;
    }
}