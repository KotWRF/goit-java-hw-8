public class Rectangle extends Shape {
    private String shapeName;
    private float side1;
    private float side2;
    private float area;

    public Rectangle (String shapeName, float side1, float side2) {
        this.shapeName = shapeName;
        this.side1 = side1;
        this.side2 = side2;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    @Override
    public String getName() {
        return "Rectangles name is " + getShapeName();
    }

    @Override
    public String getArea () {
        area = side1 * side2;
        return "Shapes area is " + area;
    }
}
