package PPJ19;

public class KulaW {
    private double radius;
    public KulaW(Kwadrat square){
    }
    public KulaW(Walec cylinder){
        double maxRadiusByHeight = cylinder.getHeight()/2;
        double maxRadiusByRadius = cylinder.getRadius();
        double radius = Math.max(maxRadiusByRadius, maxRadiusByHeight);
        this.radius = radius;
    }
}