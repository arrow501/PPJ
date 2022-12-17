package PPJ19;
public class Walec {
    // fields for the radius and height of the cylinder
    private double radius;
    private double height;

    public Walec(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public void show() {
        // calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;
        // calculate the area of the circle with the same radius
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Volume of cylinder: " + volume);
        System.out.println("Area of circle: " + circleArea);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

