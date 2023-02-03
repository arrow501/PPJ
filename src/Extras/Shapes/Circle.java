package Extras.Shapes;

public class Circle extends Figure {
    protected double radius;

    public Circle(double radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle( radius=" + radius + ", " + super.toString() + ")";
    }
}
