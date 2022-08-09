public class Line extends Shape{
    private String shapeName;
    private float length;

    public Line (String shapeName, float length) {
        this.shapeName = shapeName;
        this.length = length;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getLength() {
        return length;
    }

    @Override
    public String getName() {
        return "Lines name is " + getShapeName();
    }

    @Override
    public String getArea() {
        return "This shape has no area, but has length (L = " + getLength() + ")";
    }
}
