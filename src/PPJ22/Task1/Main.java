package PPJ22.Task1;

public class Main {
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(10);
        Rectangle rectangle = new Rectangle(3, 5);

        TriangularPrism triangularPrism = new TriangularPrism(triangle, 5);
        RectangularPrism rectangularPrism = new RectangularPrism(rectangle, 12);
        Pyramid pyramid = new Pyramid(triangle, 9);

        System.out.println("Area of pyramid:\t" + pyramid.getArea());
        System.out.println("Volume of pyramid:\t" + pyramid.getVolume());

        System.out.println("Area of rectangularPrism:\t" + rectangularPrism.getArea());
        System.out.println("Volume of rectangularPrism:\t" + rectangularPrism.getVolume());

        System.out.println("Area of triangularPrism:\t" + triangularPrism.getArea());
        System.out.println("Volume of triangularPrism:\t" + triangularPrism.getVolume());
    }
}
