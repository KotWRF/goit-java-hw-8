public class Dot extends Shape {
    private String shapeName;

    public Dot (String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String getName() {
        return "Dots name is " + getShapeName();
    }


    @Override
    public String getArea() {
        return "This shape has no area";
    }

}