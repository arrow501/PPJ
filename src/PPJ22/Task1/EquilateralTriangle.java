package PPJ22.Task1;

public class EquilateralTriangle {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }
    public EquilateralTriangle(EquilateralTriangle triangle){
        this(triangle.side);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (Math.sqrt(3) / 4) * (this.side * this.side);
    }

    public double getPerimeter() {
        return 3 * this.side;
    }
}