package Extras.Shapes;

public class Square extends Figure {
    protected double side;

    public Square(double side, int x, int y, String color) {
        super(x, y, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square( side=" + side + ", " + super.toString() + ")";
    }
}