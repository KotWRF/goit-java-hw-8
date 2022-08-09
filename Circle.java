public class Circle extends Shape{
    private String shapeName;
    private float radius;
    private float area;

    public Circle(String shapeName, float radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circles name is " + getShapeName();
    }

    @Override
    public String getArea() {
        area = (float) (3.14 * getRadius() * getRadius());
        return "Shapes area is " + area;
    }

}
