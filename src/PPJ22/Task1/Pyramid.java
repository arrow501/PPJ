package PPJ22.Task1;


public class Pyramid extends EquilateralTriangle {
    private double height;

    public Pyramid(double side, double height) {
        super(side);
        this.height = height;
    }

    public Pyramid(EquilateralTriangle base, double height){
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
        return (super.getArea() * this.height) / 3;
    }

    public double getSurfaceArea() {
        return super.getArea() + (3 * (Math.sqrt((super.getSide() / 2) * (super.getSide() / 2) + (this.height * this.height))));
    }
}
