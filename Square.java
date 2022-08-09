public class Square extends Shape {
    private String shapeName;
    private float side;
    private float area;

    public Square(String shapeName, float side) {
        this.shapeName = shapeName;
        this.side = side;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "Squares name is " + getShapeName();
    }

    @Override
    public String getArea() {
        area = getSide() * getSide();
        return "Shapes area is " + area;
    }

}
