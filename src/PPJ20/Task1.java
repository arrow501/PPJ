package PPJ20;

public class Task1 {
    public static void main(String[] args) {
        Ball ligma = Ball.makeBall();
        System.out.print("Ligma: ");
        Ball.showCounter(); // 1

        Ball[] balls = new Ball[69];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = Ball.makeBall();
        }

        System.out.print("Balls: ");
        Ball.showCounter(); // 70

        System.out.println("Ligma radius: " + ligma.getRadius());
        if (ligma.getRadius() > balls[42].getRadius())
            System.out.println("Ligma is larger than a random ball.");
    }
}
