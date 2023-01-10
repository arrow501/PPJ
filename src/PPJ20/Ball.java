package PPJ20;

import java.util.Random;

public class Ball {
    private static int ballCounter;
    private double radius;
    public Ball(double radius){
        this.radius =  radius;
        // increment ball counter
        ballCounter += 1;
    }
    public static Ball makeBall(){
        // Radius range
        int radiusMin = 10;
        int radiusMax = 20;

        // Generate random radius in range (inclusive)
        Random random = new Random();
        int radius = random.nextInt(radiusMax - radiusMin + 1 ) + radiusMin;
        // return Ball object with the random radius
        return new Ball(radius);
    }
    public static void showCounter(){
        System.out.println(Ball.ballCounter + (Ball.ballCounter==1?" Ball has":" Balls have") + " been created.");
    }
    public double getRadius(){
        return this.radius;
    }
}
