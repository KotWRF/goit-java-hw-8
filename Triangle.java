public class Triangle extends Shape{
    private String shapeName;
    private float side;
    private float h;
    private double area;

    public Triangle(String shapeName, float side, float h) {
        this.h = h;
        this.side = side;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getSide() {
        return side;
    }

    public float getH() {
        return h;
    }

    @Override
    public String getName() {
        return "Triangles name is " + getShapeName();
    }

    @Override
    public String getArea() {
        area = 0.5 * getH() * getSide();
        return "Shapes area is " +area;
    }

}
