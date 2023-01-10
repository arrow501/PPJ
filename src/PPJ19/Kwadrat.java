package PPJ19;

public class Kwadrat {
    private double side;

    public Kwadrat(double side) {
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }

    public double getSurfaceArea() {
        return this.side * this.side;
    }

    public double getVolumeOfCube() {
        return Math.pow(this.side, 3);
    }
    public void show(){
        System.out.println("surface area:\t" + getSurfaceArea());
        System.out.println("Volume of a cube with side of square:\t" + getVolumeOfCube());
    }
}
