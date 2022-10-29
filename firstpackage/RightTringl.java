package firstpackage;

public class RightTringl implements Shape{
    public double length;
    public double height;
    public double thirdSide;

    public RightTringl(){
        length = 0;
        height = 0;
        thirdSide = 0;

    }public RightTringl(double _length, double _height, double _thirdSide) {
        length = _length;
        height = _height;
        thirdSide = _thirdSide;
    }
    @Override
    public double getArea() {
        return (length * height) / 2;
    }
}


