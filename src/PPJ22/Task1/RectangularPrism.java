package PPJ22.Task1;

public class RectangularPrism extends Rectangle {
    private double height;

    public RectangularPrism(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public RectangularPrism(Rectangle base, double height){
        super(base);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getLength() {
        return super.getLength();
    }

    public double getWidth() {
        return super.getWidth();
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getSurfaceArea() {
        return 2 * (super.getArea() + this.height * super.getLength() + this.height * super.getWidth());
    }
}
