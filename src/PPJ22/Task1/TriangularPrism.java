package PPJ22.Task1;

public class TriangularPrism extends EquilateralTriangle {
    private double height;

    public TriangularPrism(double side, double height) {
        super(side);
        this.height = height;
    }
    public TriangularPrism(EquilateralTriangle base, double height){
        this(base.getSide(), height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return super.getSide();
    }

    public void setSide(double side) {
        super.setSide(side);
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getSurfaceArea() {
        return 2 * super.getArea() + (3 * (super.getSide() * this.height));
    }
}