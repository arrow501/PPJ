package PPJ19;

public class KulaNa {
    private double radius;
    public KulaNa(Kwadrat square){
        this.radius = square.getSide()*Math.sqrt(2);
    }
    public KulaNa(Walec cylinder){
        double height2 = Math.pow(cylinder.getHeight(), 2);
        double radius2 = Math.pow(cylinder.getRadius(), 2);
        
        this.radius = Math.sqrt(height2 + radius2);
    }
    public double getRadius(){
        return this.radius;
    }
}
