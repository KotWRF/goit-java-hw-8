public class ShapeTest {

    public static void main(String[] args) {
        ShapePrinter instance = new ShapePrinter();

        Dot dot = new Dot("D_0");
        Line line = new Line("L_1", 50);
        Circle circle = new Circle("C_2", 2);
        Triangle triangle = new Triangle("T_3", 10, 5);
        Square square = new Square("S_4", 3);
        Rectangle rectangle = new Rectangle("R_5", 2, 3);


        instance.printer(dot);
        instance.printer(line);
        instance.printer(circle);
        instance.printer(triangle);
        instance.printer(square);
        instance.printer(rectangle);
    }
}