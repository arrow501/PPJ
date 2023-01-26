package PPJ23.Task6;

import java.util.Random;

public class Tree {
    static Random random = new Random();
    public static Fruit pickFruit(){
        return switch(random.nextInt(3)){
            case 0 -> new Apple();
            case 1 -> new Orange();
            default -> new Pear();
        };
    }
}
