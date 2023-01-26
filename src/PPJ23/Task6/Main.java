package PPJ23.Task6;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[100];
        double fruits_weight = 0;

        int index = 0;
        while(fruits_weight <= 5_000){
            fruits[index] = Tree.pickFruit();
            fruits_weight += fruits[index].getMasa();
            index++;
        }

        int apples = 0, oranges = 0, pears = 0;
        for (Fruit fruit : fruits) {
            if(fruit == null) break;

            switch(fruit.getNazwa()){
                case "Apple" -> apples++;
                case "Orange" -> oranges++;
                case "Pear" -> pears++;
            }
        }
        System.out.println("apples: " + apples);
        System.out.println("oranges: " + oranges);
        System.out.println("pears: " + pears);
    }
}
