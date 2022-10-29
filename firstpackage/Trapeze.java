package firstpackage;

public class Trapeze implements Shape {

    private double found1;
    private double height;
    private double found2;
    private double thirdSide;
    private double fourthSide;

    public Trapeze(){
        found1 = 0;
        height = 0;
        found2 = 0;
        thirdSide = 0;
        fourthSide = 0;
    }
    public Trapeze(double _found1, double _height, double _found2, double _thirdSide, double _fourthSide){
        found1 = _found1;
        height = _height;
        found2 = _found2;
        thirdSide = _thirdSide;
        fourthSide = _fourthSide;
    }

    public void setHigh(double _hight) {
        height = _hight;
    }
    @Override
    public double getArea() {
        return ((found1 * found2) / 2) * height;
    }
}


