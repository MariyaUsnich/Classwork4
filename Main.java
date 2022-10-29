import firstpackage.*;

public class Main {

    private static Shape[] generateShapes() {
        Shape[] shapes = new Shape[15];

        // Initialization
        for (int i = 0; i < shapes.length / 5; ++i) {
            shapes[i] = new Circle(5);
        } // 1-3

        for (int i = shapes.length / 5; i < (2 * shapes.length / 5); ++i) {
            shapes[i] = new Square(10);
        } // 4-6

        for (int i = (2 * shapes.length / 5); i < (3 * shapes.length / 5); ++i) {
            shapes[i] = new Rectangle(5, 15);
        } // 7-9

        for (int i = (3 * shapes.length / 5); i < (4 * shapes.length / 5); ++i) {
            shapes[i] = new Trapeze(5,5,10,7,8);
        } // 10-12

        for (int i = (4 * shapes.length / 5); i < (5 * shapes.length / 5); ++i) {
            shapes[i] = new RightTringl(3,4, 5);
        } // 13-15

        return shapes;
    }

    public static void main(String[] args) {
        // Calculation
        double cumulativeArea = 0;
        for (Shape shape : generateShapes()) {
            cumulativeArea += shape.getArea();
        }
        System.out.println(cumulativeArea);
    }
}